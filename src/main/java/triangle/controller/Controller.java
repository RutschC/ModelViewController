package triangle.controller;

import javafx.beans.value.ChangeListener;
import triangle.model.CliInterpreter;
import triangle.view.View;
import triangle.model.Model;


public class Controller {

    private boolean started = true;
    private View view;
    private Model model;
    private CliInterpreter cliInterpreter;



    public Controller(View view){
        this.view = view;
        this.model = new Model(this);
        this.cliInterpreter = new CliInterpreter();

        assignChangeListener();
        changeListenerInitialize();
        startCliScanner();

    }

    private void changeListenerInitialize() {
        view.getResult().setText(model.triangleCalc());
    }

    public void assignChangeListener() {

        view.getaTextField().textProperty().addListener(listener);
        view.getbTextField().textProperty().addListener(listener);
        view.getcTextField().textProperty().addListener(listener);

    }
    public void startCliScanner() {
        try {
            cliInterpreter.interpretCLI(view.getCliInput());
        } catch (Exception e) {
            System.out.println("Keine Konsoleneingabe festgestellt");
        }
    }


    ChangeListener<String> listener = (ObservableValue, oldValue,newValue) ->{
        try {


            //Längen des Dreiecks werden im Model gesetzt
            model.setA(Integer.parseInt(view.getaTextField().getText()));
            model.setB(Integer.parseInt(view.getbTextField().getText()));
            model.setC(Integer.parseInt(view.getcTextField().getText()));

            //Resultat wird im View gezeigt
            view.showResult(model.triangleCalc());
            startCliScanner();

        } catch (NumberFormatException e) {
            view.error();
        }
    };


}
