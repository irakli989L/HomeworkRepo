package N2;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;


public class ColorSceneController {
    @FXML
    private AnchorPane anchorPane;

    public void setColor(String color) {
        anchorPane.setStyle("-fx-background-color: " + color + ";");
    }

    @FXML
    private void goBack() {
        SceneHelper.mainStage.setScene(SceneHelper.mainScene);
    }
}
