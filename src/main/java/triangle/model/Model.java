package triangle.model;

import triangle.controller.Controller;
import triangle.view.View;

import java.util.ArrayList;
import java.util.List;

public class Model {


    //Each triangle side has its designated value
    private int a;
    private int b;
    private int c;

    private Controller controller;
    // private List<View> observers = new ArrayList<View>();


    public Model(Controller controller){
        this.controller = controller;
        a = 1;
        b = 1;
        c = 1;
    }

    public void addObserver(View observer) {
        //observers.add(observer);
    }

    public void removeObserver(View observer) {
        //observers.remove(observer);
    }

//    public void notifyObservers() {
//        for (View observer: observers){
//            observer.modelChanged(this);
//        }
//    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


    //    public void updateValues(List listener){
//        notifyObservers();
//
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
//
//
//    }
}
