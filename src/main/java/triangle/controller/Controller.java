package triangle.controller;

import javafx.beans.value.ChangeListener;
import triangle.view.View;


public class Controller{

    private View view;

    public Controller(View view){
        this.view = view;


        assignChangeListener();
    }

    public void assignChangeListener() {
        // Hier ChangeListener zu dem jeweiligen View hinzufügen, sodass die Verarbeitung im Controller stattfindet, jedoch im View ankommt
    }


    // Dieser ChangeListener wird für alle drei Textfelder verwendet und aufgerufen, wenn sich der Text in den
    // Textfeldern ändert. Der ChangeListener wird als Lambda-Ausdruck definiert, der implizit konvertiert wird.
    ChangeListener<String> listener = (observableValue, oldValue, newValue) -> {
        try {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());
            int c = Integer.parseInt(cTextField.getText());
            if (a == b && b == c) {
                result.setText("gleichseitig");
            } else if (a == b || a == c || b == c) {
                result.setText("gleichschenklig");
            } else {
                result.setText("ungleichseitig");
            }
        } catch (NumberFormatException e) {
            result.setText("ungültig");
        }
    };


}
