package triangle.model;

import triangle.controller.Controller;
import triangle.view.CommandLine;
import triangle.view.GraphicalUserInt;


public class Logic {


    //Each triangle side has its designated value
    private int a;
    private int b;
    private int c;
    private String result;
    private Controller controller;
    private boolean cliInputGiven = false;


    //Observer
    private CommandLine commandLine;
    private GraphicalUserInt graphicalUserInt;


    private String[] segments;


    public Logic(Controller controller){
        this.controller = controller;
        a = 1;
        b = 2;
        c = 3;
    }

    public void setViews(CommandLine commandLine, GraphicalUserInt graphicalUserInt) {
        this.commandLine = commandLine;
        this.graphicalUserInt = graphicalUserInt;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getResult() {
        return result;
    }

    public void triangleCalc() {
        if (a == b && b == c) {
            result = "gleichseitig";
        } else if (a == b || a == c || b == c) {
            result = "gleichschenklig";
        } else {
            result = "ungleichseitig";
        }
        update();
    }

    private void update() {
        commandLine.cliOutput();
        graphicalUserInt.showResult();
        cliInputGiven = false;
    }

    public void interpretCLI(String cliInput) {
        //CLI input in form of a = 2
        segments = cliInput.split(" ");

        try {
            if ((segments[0].equals("a") || segments[0].equals("b") || segments[0].equals("c")) && segments[1].equals("=")) {
                cliInputGiven = true;
                if (segments[0].equals("a")) {
                    a = Integer.parseInt(segments[2]);
                    triangleCalc();
                } else if (segments[0].equals("b")) {
                    b = Integer.parseInt(segments[2]);
                    triangleCalc();
                } else {
                    c = Integer.parseInt(segments[2]);
                    triangleCalc();
                }
            }
            else {
                graphicalUserInt.error();
                commandLine.error();
            }
        } catch (NumberFormatException e) {
            graphicalUserInt.error();
            commandLine.error();
        }
    }


    public boolean cliInputgiven() {
        return cliInputGiven;
    }
}

