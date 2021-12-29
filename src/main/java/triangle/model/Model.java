package triangle.model;

import triangle.controller.Controller;
import triangle.view.View;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private Controller controller;
    private List<View> observers = new ArrayList<View>();



    public Model(Controller controller){
        this.controller = controller;
    }

    public void addObserver(View observer) {
        observers.add(observer);
    }

    public void removeObserver(View observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (View observer: observers){
            observer.modelChanged(this);
        }
    }
}
