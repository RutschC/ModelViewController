package triangle.controller;

import javafx.beans.value.ChangeListener;
import triangle.view.CommandLine;
import triangle.view.GraphicalUserInt;
import triangle.model.Logic;


public class Controller {

    private GraphicalUserInt graphicalUserInt;
    private Logic logic;
    private CommandLine commandLine;




    public Controller(){
        logic = new Logic(this);
        graphicalUserInt = new GraphicalUserInt(logic);
        commandLine = new CommandLine(logic);

        assignViews();
        assignChangeListener();
        startCliScanner();

    }

    private void assignViews() {
        logic.setViews(commandLine, graphicalUserInt);
    }


    private void assignChangeListener() {

        graphicalUserInt.getaTextField().textProperty().addListener(listener);
        graphicalUserInt.getbTextField().textProperty().addListener(listener);
        graphicalUserInt.getcTextField().textProperty().addListener(listener);

    }
    private void startCliScanner() {
        commandLine.getCliInput();
    }


    ChangeListener<String> listener = (ObservableValue, oldValue,newValue) ->{
        try {
            //Längen des Dreiecks werden im Model gesetzt
            logic.setA(Integer.parseInt(graphicalUserInt.getaTextField().getText()));
            logic.setB(Integer.parseInt(graphicalUserInt.getbTextField().getText()));
            logic.setC(Integer.parseInt(graphicalUserInt.getcTextField().getText()));

            if(!logic.cliInputgiven()) {
                logic.triangleCalc();
            }

        } catch (NumberFormatException e) {
            graphicalUserInt.error();
            commandLine.error();
        }
    };

    public GraphicalUserInt getGraphicalUserInt() {
        return graphicalUserInt;
    }

}
