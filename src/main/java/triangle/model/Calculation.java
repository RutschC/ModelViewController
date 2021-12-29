package triangle.model;

public class Calculation {


    //Each triangle side has its designated value
    private int a = 0;
    private int b = 0;
    private int c = 0;

    private String result ="ungültig";



    //Setter for each side
    public void setA(int a) {
        this.a = a;
        update();
    }

    public void setB(int b) {
        this.b = b;
        update();
    }

    public void setC(int c) {
        this.c = c;
        update();
    }


    //Getter for each side and the result
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getResult() {
        return result;
    }



    public String update() {
        if (a == b & b == c) {
            result = "gleichseitig";
        } else if ( a == b || a == c || b == c) {
            result = "gleichschenklig";
        } else {
            result = "ungleichseitig";
        }

        return result;
    }
}
