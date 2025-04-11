package N1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class alertController {
    @FXML
    private AnchorPane anchorPane;

    private int clickCount = 0;

    @FXML
    private void handleClick() {
        clickCount++;
        if (clickCount == 5) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit Confirmation");
            alert.setHeaderText("Do you want to exit the application?");
            alert.setContentText("Click OK to exit or Cancel to stay.");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    Stage stage = (Stage) anchorPane.getScene().getWindow();
                    stage.close();
                } else {
                    clickCount = 0;
                }
            });
        }
    }
}
