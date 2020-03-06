//Edgar Rosa Rey
package pk_edgar;
//Libraries:

import java.util.Scanner;

public class ControlM3_Rosa {

    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
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

    private static void p1() {
        System.out.println("*****Option 1*****");
        int count = 0;
        String user = null, pass = null;

        System.out.println("LOGIN PLEASE");
        System.out.println("User:");
        user = keyboard.next();
        System.out.println("Password:");
        pass = keyboard.next();
        if (user.equals("Edgar") && pass.equals("monlau")) {
            System.out.println("Welcome");
        } else {
            while (count <= 4) {
                System.out.println("User:");
                user = keyboard.next();
                System.out.println("Password:");
                pass = keyboard.next();

            }
        }
    }

    private static void p2() {
        int N, count, numberRandom = 0;
        final int Nmax = 10000;
        System.out.println("How many lotteries do you want to buy?");
        N = keyboard.nextInt();
        for (count = 0; count < N; count++) {
            numberRandom = (int) (Math.random() * Nmax);
            System.out.println(numberRandom);

        }

    }

    private static void p3() {
        int N1 = 0, N2 = 0, count;
        System.out.println("N1:?");
        N1 = keyboard.nextInt();
        System.out.println("N2:?");
        N2 = keyboard.nextInt();
        for (count = N1; count <= N2; count++) {
            if (count % 7 == 0) {
                System.out.print(count + " ");
            }

        }

    }

    private static void p4() {
        int N1 = 0, N2 = 0, count;
        System.out.println("N1:?");
        N1 = keyboard.nextInt();
        System.out.println("N2:?");
        N2 = keyboard.nextInt();
        count = N1;
        while (count <= N2) {
            if (count % 7 == 0) {
                System.out.print(count + " ");
            }
            count++;
        }

    }

    private static void p5() {
        int N1 = 0, N2 = 0, count;
        System.out.println("N1:?");
        N1 = keyboard.nextInt();
        System.out.println("N2:?");
        N2 = keyboard.nextInt();
        count = N1;
        do {
            if (count % 7 == 0) {
                System.out.print(count + " ");
            }
            count++;
        } while (count <= N2);

    }

    private static void p6() {
        int N, height, weight;
        String name, gender;
        System.out.println("How many students are in class?");
        N = keyboard.nextInt();
        for (int count = 1; count <= N; count++) {
            System.out.println("Student's name " + count + ":?");
            name = keyboard.next();
            System.out.println("Student gender " + count + ":?");
            gender = keyboard.next();
            System.out.println("Student height " + count + ":?");
            height = keyboard.nextInt();
            System.out.println("Student weight " + count + ":?");
            weight = keyboard.nextInt();
        }
    }

    private static void p7() {

    }

    private static void p8() {
    }

    private static void p9() {
    }

    private static void p0() {
    }

}
