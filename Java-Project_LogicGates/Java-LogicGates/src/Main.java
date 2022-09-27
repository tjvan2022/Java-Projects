/*
       Date: September 3, 2022
       Description:
       This java project is really interesting and an eye-catching project for engineering students.
       You may be knowing that logic gates are implemented using boolean functions and are used to perform specific logical operations.
       There are six basic logic gates which are: AND gate, OR gate, NOT gate, NAND gate, and NOR gate.
       The NOT gate performs on a single input and all other gates can be performed with either two or three inputs.
       In this system, you can give the logical inputs to the gates of your requirement and get the result in either 0 or 1.
       There will be options to choose 2-input or 3-input in the gates except for the NOT gate that will take only a single input(0 or 1) from the user.
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        //System.out.println("Hello World!");

        logicMenu();

    }

    static void logicMenu()
    {
        Scanner readUserInputObject = new Scanner(System.in);
        boolean exitProgram = true;
        int switchStatementInput = 0;


        try {
            while (exitProgram) {
                // System.out.println("Please input a line");
                // String line = readUserInputObject.nextLine();
                // System.out.printf("User input was: %s%n", line);
                System.out.println("");
                System.out.println("Please select GATE function");
                System.out.println("1. 2-Input AND Gate");
                System.out.println("2. Exit");
                String line = readUserInputObject.nextLine();
                switchStatementInput = Integer.parseInt(line);


                switch(switchStatementInput) {
                    case 1:
                        // code block
                        break;
                    case 2:
                        exitProgram = false;
                        break;
                    default:
                        // code block
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }

    }
    // test comment
    static void twoInputAndGate()
    {
        Scanner readUserInputObject = new Scanner(System.in);
        boolean exitProgram = true;
        int switchStatementInput = 0;

        try {
            while (exitProgram) {
                // System.out.println("Please input a line");
                // String line = readUserInputObject.nextLine();
                // System.out.printf("User input was: %s%n", line);
                System.out.println("");
                System.out.println("Please select GATE function");
                System.out.println("1. 2-Input AND Gate");
                System.out.println("2. Exit");
                String line = readUserInputObject.nextLine();
                switchStatementInput = Integer.parseInt(line);


                switch(switchStatementInput) {
                    case 1:
                        // code block
                        break;
                    case 2:
                        exitProgram = false;
                        break;
                    default:
                        // code block
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }
    }

}

