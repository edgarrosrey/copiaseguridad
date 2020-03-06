//Author: Edgar
//WHILE
package PK_EDGAR;

import java.util.Scanner;

public class MainClass {
//Global declarations:

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
        }
        switch (option) {//init of switch 
            case 1:
                p1();
                break;
            case 2:
                p2();
        }
    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.println("Option1:(Numeros de 0 a 9):");
        System.out.println("Option2:");
        System.out.println("Option3:");
        System.out.println("Option4:");
        System.out.println("Option5:");
        System.out.println("Option6:");
        System.out.println("Option7:");
        System.out.println("Option8:");
        System.out.println("Option9:");
        System.out.println("Option0: (exit):");

        System.out.println("\n\noption ?");
    }

    private static void testWhile() {
        int i = 0; //init value
        while (i < 4) { //condition
            System.out.println("in while i=" + i);
            i++; //step
        }

    }

    private static void p1() {
        int count = 0; //init value
        while (count <= 0) {//condition
            System.out.println(count);
            count++;
        }
    }

    private static void p2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
