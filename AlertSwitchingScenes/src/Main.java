import N2.SceneHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // N1

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("N1/exitAlert.fxml"));
//
//        Parent root = loader.load();
//
//        Scene scene = new Scene(root);
//
//        stage.setScene(scene);
//        stage.setOnCloseRequest(WindowEvent::consume);
//        stage.show();


        // N2

        FXMLLoader loader = new FXMLLoader(getClass().getResource("N2/scene1.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        SceneHelper.mainStage = stage;
        SceneHelper.mainScene = scene;

        stage.setScene(scene);
        stage.show(); // ar mushaobs.........................................
    }
}