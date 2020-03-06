//Author:Edgar
//Random
package PK_EDGAR;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainClass {
//Global Declarations:

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {//start of main
        int option;
        do {//start of do-while
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
                    System.out.println("Invalid Option ....");
            }//end of switch
        } while (option != 0); //end of do-while
    }//end of main

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
        System.out.println("\n------Option ?-------");

    }

    private static void p1() {
        System.out.println("*****Option 1*****");
        int numberRandom;
        int Nmax = 6;
        numberRandom = (int) (Math.random() * Nmax) + 1;
        System.out.println(numberRandom);
    }

    private static void p2() {
        System.out.println("*****Option 2*****");
        int nTimes, numberRandom = 0, Nmax = 6, sum = 0;
        float med;
        System.out.println("N times:");
        nTimes = keyboard.nextInt();
        System.out.print("Dado:");
        for (int index = 0; index < nTimes; index++) {
            numberRandom = (int) (Math.random() * Nmax) + 1;
            System.out.print(numberRandom);
            if (index < nTimes - 1) {
                System.out.print(",");
            }
            //sum=sum +numberRandom
            sum += numberRandom;
        }
        med = (float) sum / nTimes;
        System.out.println("");
        System.out.println(sum);
        System.out.println(med);
    }

    private static void p3() {
        System.out.println("*****Option 3*****");
        int numberRandom, nTimes, index, total, rest;
        final int Nmax = 10000; //constante
        final int priceOne = 20;
        int money;
        System.out.println("How much do you want to spend?:");
        money = keyboard.nextInt();
        //Cuantas loterias??
        System.out.println("How many lotteries do you want?");
        nTimes = keyboard.nextInt();
        System.out.println("Your numbers are:");
        for (index = 0; index <= nTimes; index++) {
            numberRandom = (int) (Math.random() * Nmax);
            System.out.print(numberRandom + " ");
        }
        System.out.println("");
        total = priceOne * nTimes;
        rest = money - total;
        System.out.println("You have left over " + rest + "€");
    }

    private static void p4() {
        System.out.println("*****Option 4*****");
        DecimalFormat df = new DecimalFormat("##.00 ");
        DecimalFormat df2 = new DecimalFormat("0000.00 ");
        float number;
        System.out.println("Number ?:");
        number = keyboard.nextFloat();
        //number=Float.parseFloat(JOptionPane.showInputDialog("Number ?"));
        //String data=JOptionPane.showInputDialog("Number ?");
        // number=Float.parseFloat(data);
        System.out.println(df.format(number));
        System.out.println(df2.format(number));
    }

    private static void p5() {
        System.out.println("*****Option 5*****");
        final int Ncol = 3;
        int indexCol = 256 / Ncol;
        for (int index = 0; index < 256 / Ncol; index++) {
            System.out.print(index + "-" + (char) index);
            System.out.print("\t" + (index + 86) + "-" + (char) (index + 86));
            System.out.print("\t" + (index + 172) + "-" + (char) (index + 172));
            System.out.println("");

        }

    }

    private static void p6() {
        System.out.println("*****Option 6*****");
        int numberRandom, num;
        int Nmax = 9, points = 0;
        for (int index = 0; index <= 10; index++) {
            System.out.print("Number from 1 to 9:");
            num = keyboard.nextInt();
            System.out.print("Number random:");
            numberRandom = (int) (Math.random() * Nmax) + 1;
            System.out.println(numberRandom + " ");
            if (num == numberRandom) {
                points = points + 1;
            }
        }
        System.out.println("You have won " + points + " points");

    }

    private static void p7() {
        System.out.println("*****Option 7*****");
        int numberRandom;
        int Nmax = 100000;
        int nWeek = 0;
        int nGM = (int) (Math.random() * Nmax);
        do {
            numberRandom = (int) (Math.random() * Nmax);
            //System.out.println(numberRandom);
            nWeek++;
        } while (numberRandom != nGM);
        System.out.println(nWeek / 52 + "years");

    }

    private static void p8() {
        System.out.println("*****Option 8*****");
        
        
    }

    private static void p9() {
        System.out.println("*****Option 9*****");
    }

    private static void p0() {
    }

}
