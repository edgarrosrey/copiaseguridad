/*
09/12/19
 */
//Author: Edgar
package PK_EDGAR;
//Libraries:

import java.util.Arrays;
import java.util.Scanner;

public class M3_P13 {

    //Global declarations:
    static Scanner keyboard = new Scanner(System.in);
    static String userName, nsubject;
    static String[] nameSubject;
    static double[] subjectMark;
    static int numsubjects;
    static double average = 0;
    static int suspended = 0, approved = 0;

    public static void main(String[] args) {
        int option;

        keyboard.useDelimiter("\n");
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
                case 10:
                    p10();
                    break;
                case 11:
                    p11();
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Invalid Option ....");
            }//end of switch
        } while (option != 0); //end of do-while

    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Option1:(Numeros de 0 a 10):");
        System.out.println("Option2:");
        System.out.println("Option3:");
        System.out.println("Option4:");
        System.out.println("Option5:");
        System.out.println("Option6:");
        System.out.println("Option7:");
        System.out.println("Option8:");
        System.out.println("Option9:");
        System.out.println("Option10:");
        System.out.println("Option11:");
        System.out.println("Option0: (exit):");

        System.out.println("\n\nOption ?");

    }

    private static void p1() {

        System.out.println("*****Option 1*****");
        System.out.println("User Name:?");
        userName = keyboard.next();
        System.out.println("How many subjects do you do?");
        numsubjects = keyboard.nextInt();
        nameSubject = new String[numsubjects];
        subjectMark = new double[numsubjects];

    }

    private static void p2() {
        System.out.println("*****Option 2*****");

        System.out.println("User Name:?");
        userName = keyboard.next();
        System.out.println("How many subjects do you do?");
        numsubjects = keyboard.nextInt();

        nameSubject = new String[numsubjects];
        subjectMark = new double[numsubjects];

        for (int index = 0; index < subjectMark.length; index++) {
            System.out.println("\n");
            System.out.println("Name Of Subject:?");
            nameSubject[index] = keyboard.next();
            System.out.print("" + "Mark of " + nameSubject[index] + "?:");
            subjectMark[index] = keyboard.nextDouble();

        }
    }

    private static void p3() {
        System.out.println("*****Option 3*****");
        System.out.println("_____MARKS_____");
        for (int i = 0; i < numsubjects; i++) {
            System.out.println(nameSubject[i] + "\t" + subjectMark[i]);
        }
    }

    private static void p4() {
        System.out.println("*****Option 4*****");
        float maxValue = 0;
        int positionMax = 0;
        float minValue = 10;
        int positionMin = 0;
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] > maxValue) {
                maxValue = (int) subjectMark[i];
                positionMax = i;

            }
        }
        System.out.println("Best mark is: ");
        System.out.println(nameSubject[positionMax] + ": " + subjectMark[positionMax]);
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] < minValue) {
                minValue = (int) subjectMark[i];
                positionMin = i;

            }
        }
        System.out.println("Worst mark is: ");
        System.out.println(nameSubject[positionMin] + ": " + subjectMark[positionMin]);
    }

    private static void p5() {
        System.out.println("*****Option 5*****");
        double sumMarks = 0;
        System.out.print("Average of the notes:");
        for (int i = 0; i < numsubjects; i++) {
            sumMarks += subjectMark[i];
        }
        average = sumMarks / numsubjects;
        System.out.println(" " + average);

    }

    private static void p6() {
        System.out.println("*****Option 6*****");
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] >= 5) {
                System.out.println("" + nameSubject[i]);
                approved += 1;
            }
        }
        System.out.println("Approved subjects: " + approved);
    }

    private static void p7() {
        System.out.println("*****Option 7*****");
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] <= 5) {
                System.out.println("" + nameSubject[i]);
                suspended += 1;
            }
        }
        System.out.println("Suspended subjects: " + suspended);
    }

    private static void p8() {
        System.out.println("*****Option 8*****");
        int recovered = 0;
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] < 5) {
                System.out.println("" + nameSubject[i]);
                recovered += 1;
                subjectMark[i] = 5;
                System.out.println("" + subjectMark[i]);
            }
        }
        System.out.println("Subjects recovered: " + recovered);
    }

    private static void p9() {
        System.out.println("*****Option 9*****");
        double sumMarks = 0;
        for (int i = 0; i < numsubjects; i++) {
            sumMarks += subjectMark[i];
        }
        average = sumMarks / numsubjects;

        System.out.println("Average:" + average);
        System.out.println("Subjects above average: ");
                for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] > average) {
                System.out.println("" + nameSubject[i] +" "+ subjectMark[i]);
            }
        }
    }

    private static void p10() {
        System.out.println("*****Option 10*****");
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] >= 5) {
                approved += 1;
            }
        }
        for (int i = 0; i < numsubjects; i++) {
            if (subjectMark[i] <= 5) {
                suspended += 1;
            }
        }
        if (suspended <= 2 || approved == numsubjects) {
            System.out.println("You have passed the course");
        } else {
            System.out.println("I'm sorry but you have more than 2 subjects left, you have to repeat course");
        }
    }

    private static void p0() {
    }

      private static void p11() {
          Arrays.sort(subjectMark);
          System.out.println(Arrays.toString(subjectMark));
    }

    private static void p12() {
        System.out.println("*****Option 11*****");
        //DAM1- 6asig
        //crear un array de 6 elementos nombre de asignaturas
        String[] nameSubject = new String[]{"M1", "M2", "M3", "M4", "M5", "M15"};
        /*
        String[] name=new String[6];
        name=new String[]{"M1","M2","M3","M4","M5","M15"};
         */
        double[] subjectMark = new double[6];
        for (int index = 0; index < subjectMark.length; index++) {
            System.out.print(nameSubject[index] + "?:");
            subjectMark[index] = keyboard.nextDouble();
        }
    }

}
