package triangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import triangle.controller.Controller;
import triangle.view.View;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        View view = new View();

        Controller controller = new Controller(view);

        primaryStage.setTitle("TriangleCalculator");
        primaryStage.setScene(new Scene(view.getView()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
