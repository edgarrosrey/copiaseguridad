//Author:edgarrosrey
//FOR - SWITCH

import java.util.Scanner;

public class NewMain {

    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch 
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 4:
                    p4();
                    break;
                case 5:
                    p5();
                    break;
                case 6:
                    p6();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    p8();
                    break;
                case 9:
                    p9();
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Option No ....");
            }//end of switch
            //System.out.println("press any key to continue");
            //String key=keyboard.next();
        }
    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
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

    private static void p1() throws InterruptedException {
        System.out.println("*****Option 1*****");
              int count;
        for (count = 0; count < 10; count++) {
            if (count == 5) {
                System.out.println("");
            }
        }
            System.out.print(count + "\t");
            Thread.sleep(1000); 
    }

    private static void p2() throws InterruptedException {
        System.out.println("*****Option 2*****");
    }

    private static void p3() throws InterruptedException {
        System.out.println("*****Option 3*****");
    }

    private static void p4() {
        System.out.println("*****Option 4*****");
    }

    private static void p5() {
        System.out.println("*****Option 5*****");
    }

    private static void p6() {
        System.out.println("*****Option 6*****");
    }

    private static void p7() {
        System.out.println("*****Option 7*****");
    }

    private static void p8() {
        System.out.println("*****Option 8*****");
    }

    private static void p9() {
        System.out.println("*****Option 9*****");
    }

    private static void p0() {
        System.out.println("*****Option 0*****");
    }

}
