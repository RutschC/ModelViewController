package triangle.view;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import triangle.controller.Controller;
import triangle.model.Model;

public class View extends Application {


    private Controller controller;
    private TextField aTextField;
    private TextField bTextField;
    private TextField cTextField;

    public View(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        // Titel der Anwendung setzen, der als Überschrift des Hauptfensters angezeigt wird
        primaryStage.setTitle("Dreieck");

        // Drei Textfelder erzeugen

        aTextField = new TextField("1");
        bTextField = new TextField("2");
        cTextField = new TextField("3");

        // Wir verwenden eine GridPane für das Layout und ordnen die Label und Textfelder in diesem Raster an
        GridPane root = new GridPane();

        root.setVgap(20);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

        root.add(new Text("a"), 0, 0);
        root.add(aTextField, 1, 0);
        root.add(new Text("b"), 0, 1);
        root.add(bTextField, 1, 1);
        root.add(new Text("c"), 0, 2);
        root.add(cTextField, 1, 2);

        Text result = new Text();

        root.add(result, 0, 3, 2, 1);
    }


    public void modelChanged(Controller controller){
        this.controller = controller;
    }

    public void modelChanged(Model model) {
    }

    public void addChangeListener(ChangeListener l) {
        aTextField.textProperty().addListener(l);
        bTextField.textProperty().addListener(l);
        cTextField.textProperty().addListener(l);
    }
}