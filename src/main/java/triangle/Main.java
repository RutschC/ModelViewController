package triangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import triangle.controller.Controller;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        Controller controller = new Controller();

        primaryStage.setTitle("TriangleCalculator");
        primaryStage.setScene(new Scene(controller.getGraphicalUserInt().getView()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
