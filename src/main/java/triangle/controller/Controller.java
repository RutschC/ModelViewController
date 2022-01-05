package triangle.controller;

import javafx.beans.value.ChangeListener;
import triangle.view.View;
import triangle.model.Model;


public class Controller{

    private View view;
    private Model model;


    public Controller(View view){
        this.view = view;
        assignChangeListener();

        this.model = new Model(this);
    }

    public void assignChangeListener() {

        view.getaTextField().textProperty().addListener((observableValue, oldValue, newValue) -> view.getaTextField().textProperty().setValue(newValue));
        view.getbTextField().textProperty().addListener(new ChangeListener<Number>() {

        });

        // view.addChangeListener(listener);
        // view.getaTextField().
    }


    // Keine Ahnung wie man den ChangeListener richtig in MCV umsetzt.
    // Über ActionListener probieren...

    // Dieser ChangeListener wird für alle drei Textfelder verwendet und aufgerufen, wenn sich der Text in den
    // Textfeldern ändert. Der ChangeListener wird als Lambda-Ausdruck definiert, der implizit konvertiert wird.
//    ChangeListener<String> listener = (observableValue, oldValue, newValue) -> {
//        try {
//            int a = Integer.parseInt(aTextField.getText());
//            int b = Integer.parseInt(bTextField.getText());
//            int c = Integer.parseInt(cTextField.getText());
//            if (a == b && b == c) {
//                result.setText("gleichseitig");
//            } else if (a == b || a == c || b == c) {
//                result.setText("gleichschenklig");
//            } else {
//                result.setText("ungleichseitig");
//            }
//        } catch (NumberFormatException e) {
//            result.setText("ungültig");
//        }
//    };


}
