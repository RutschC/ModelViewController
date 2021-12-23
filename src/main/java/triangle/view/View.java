package triangle.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application {

    public View(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) {
        // Titel der Anwendung setzen, der als Überschrift des Hauptfensters angezeigt wird
        primaryStage.setTitle("Dreieck");

        // Drei Textfelder erzeugen
        TextField aTextField = new TextField("1");
        TextField bTextField = new TextField("2");
        TextField cTextField = new TextField("3");

        // Wir verwenden eine GridPane für das Layout und ordnen die Label und Textfelder in diesem Raster an
        GridPane root = new GridPane();

        root.setVgap(20);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

        root.add(new Text("a"), 0, 0);
        root.add(aTextField, 1,0);
        root.add(new Text("b"), 0, 1);
        root.add(bTextField, 1,1);
        root.add(new Text("c"), 0, 2);
        root.add(cTextField, 1,2);

        Text result = new Text();

        root.add(result, 0,3, 2, 1);
}