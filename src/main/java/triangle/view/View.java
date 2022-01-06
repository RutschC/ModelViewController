package triangle.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import triangle.controller.Controller;

import java.util.Scanner;

public class View{


    private Controller controller;
    private TextField aTextField;
    private TextField bTextField;
    private TextField cTextField;
    private Label result;
    private final Scanner scanner;
    public String cliInput;

    private final Parent view;

    public View() {
        view = createView();
        scanner = new Scanner(System.in);
    }

    //Create a VBox with three textfields and one label. Each textfiel represents one side of the triangle.
    //The label will show the result of the calculation
    private VBox createView() {
        VBox vbox = new VBox(15);
        vbox.setPrefWidth(300);
        vbox.setPrefHeight(250);
        vbox.setPadding(new Insets(15));



        // Wir verwenden eine GridPane für das Layout und ordnen die Label und Textfelder in diesem Raster an
        GridPane root = new GridPane();

        root.setVgap(20);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

        // Drei Textfelder erzeugen

        aTextField = new TextField("1");
        bTextField = new TextField("2");
        cTextField = new TextField("3");

        // Label erzeugen

        result = new Label("");

        root.add(new Text("a"), 0, 0);
        root.add(aTextField, 1, 0);
        root.add(new Text("b"), 0, 1);
        root.add(bTextField, 1, 1);
        root.add(new Text("c"), 0, 2);
        root.add(cTextField, 1, 2);
        root.add(result, 0, 3, 2, 1);
        vbox.getChildren().add(root);

        return vbox;
    }


    public TextField getaTextField() {
        return aTextField;
    }

    public TextField getbTextField() {
        return bTextField;
    }

    public TextField getcTextField() {
        return cTextField;
    }

    public Parent getView() {
        return view;
    }

    public Label getResult() {
        return result;
    }

    public void error() {
        result.setText("Ungültige Eingabe");
        System.out.print("Ungültige Eingabe");
    }
    //showResult is called in the controller
    public void showResult(String result){
        this.result.setText(result);
        cliOutput();
    }

    //Method is responsible for the cli output
    public void cliOutput(){
        System.out.println("a = " + aTextField.getText());
        System.out.println("b = " + bTextField.getText());
        System.out.println("c = " + cTextField.getText());
        System.out.println(result.getText() + "\n");
    }

    public boolean readCli(){
        try {
            return scanner.hasNext() && scanner.next().length() >= 5;
        } catch (NullPointerException e) {
            return false;
        }

    }

    public String getCliInput() {
        cliInput = scanner.nextLine();
        return cliInput;
    }

    public void setValues(String[] segments) {
        if (segments[0].equals("a")) {
            aTextField.setText(segments[2]);
        } else if (segments[0].equals("b")) {
            bTextField.setText(segments[2]);
        } else {
            cTextField.setText(segments[2]);
        }
    }
}