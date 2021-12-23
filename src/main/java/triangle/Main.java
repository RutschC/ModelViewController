package triangle;

import triangle.controller.Controller;
import triangle.view.View;

public class Main {

    public static void main(String[] args) {

        //Create the view
        View view = new View(args);
        //Create the controller and pass the view object to it
        new Controller(view);
    }
}
