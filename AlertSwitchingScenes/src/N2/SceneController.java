package N2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneController {
    public void switchToYellow() throws Exception {
        loadColorScene("yellow");
    }

    public void switchToRed() throws Exception {
        loadColorScene("red");
    }

    public void switchToGreen() throws Exception {
        loadColorScene("green");
    }

    private void loadColorScene(String color) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("color_scene.fxml"));
        Parent root = loader.load();

        // Set color
        ColorSceneController controller = loader.getController();
        controller.setColor(color);

        Scene scene = new Scene(root, 400, 300);
        SceneHelper.mainStage.setScene(scene);
    }
}
