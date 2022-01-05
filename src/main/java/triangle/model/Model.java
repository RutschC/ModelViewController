package triangle.model;

import triangle.controller.Controller;



public class Model {


    //Each triangle side has its designated value
    private int a;
    private int b;
    private int c;
    private String result;
    private Controller controller;


    public Model(Controller controller){
        this.controller = controller;
        a = 1;
        b = 1;
        c = 1;
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

    public String triangleCalc() {
        if (a == b && b == c) {
            result = "gleichseitig";
        } else if (a == b || a == c || b == c) {
            result = "gleichschenklig";
        } else {
            result = "ungleichseitig";
        }
        return result;
    }

}

