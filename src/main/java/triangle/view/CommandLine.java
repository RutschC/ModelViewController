package triangle.view;

import triangle.controller.Controller;
import triangle.model.Logic;

import java.io.IOException;
import java.util.Scanner;

public class CommandLine {

    private Scanner scanner;
    public String cliInput;
    private Controller controller;
    private Logic logic;


    public CommandLine(Logic logic) {
        this.logic = logic;
        scanner = new Scanner(System.in);
    }

    public static void error() {
        System.out.println("Ungültige Eingabe");
    }

    //Method is responsible for the cli output
    public void cliOutput(){
        System.out.println("a = " + logic.getA());
        System.out.println("b = " + logic.getB());
        System.out.println("c = " + logic.getC());
        System.out.println(logic.getResult() + "\n");
    }

    public void getCliInput() {
        new Thread(() -> {
            while(true) {
                try {
                    if (System.in.available() > 0) {
                        cliInput = scanner.nextLine();
                        logic.interpretCLI(cliInput);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }).start();
    }



}
