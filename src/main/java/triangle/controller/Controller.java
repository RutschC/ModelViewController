package triangle.controller;

import javafx.beans.value.ChangeListener;
import triangle.view.View;
import triangle.model.Model;


public class Controller {

    private View view;
    private Model model;



    public Controller(View view){
        this.view = view;
        this.model = new Model(this);

        assignChangeListener();
        changeListenerInitialize();

    }

    private void changeListenerInitialize() {
        view.getResult().setText(model.triangleCalc());
    }

    public void assignChangeListener() {

        view.getaTextField().textProperty().addListener(listener);
        view.getbTextField().textProperty().addListener(listener);
        view.getcTextField().textProperty().addListener(listener);

    }

    ChangeListener<String> listener = (ObservableValue, oldValue,newValue) ->{
        try {
            //Längen des Dreiecks werden im Model gesetzt
            model.setA(Integer.parseInt(view.getaTextField().getText()));
            model.setB(Integer.parseInt(view.getbTextField().getText()));
            model.setC(Integer.parseInt(view.getcTextField().getText()));

            //Resultat wird im View gezeigt
            view.getResult().setText(model.triangleCalc());



        } catch (NumberFormatException e) {
            view.error();
        }
    };


}
