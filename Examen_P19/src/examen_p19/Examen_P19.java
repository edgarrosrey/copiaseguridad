package examen_p19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Examen_P19 {
//Global Declarations

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    static int nteams;
    static String[] name;
    static int[] nM;
    static int[] nR;
    static int[] points;
    static int index;
    static int maxValue = 10;
    static int positionMax = 0;
    static int minValue = 0;
    static int positionMin = 0;
    static int positionWinner = 0;

    public static void main(String[] args) {
        int option = -1;
        keyboard.useDelimiter("\n");
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch 
                case 1:
                    equipmentData();
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
                default:
                    System.out.println("Invalid Option...");
            }

        }

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
        System.out.println("Option10: (exit):");

        System.out.println("\n\nOption ?");

    }

    private static void equipmentData() {
        System.out.println("Option 1:");
        System.out.print("How many teams in the league are there?:");
        nteams = keyboard.nextInt();
        name = new String[nteams];
        nM = new int[nteams];
        nR = new int[nteams];
        points = new int[nteams];
        for (index = 0; index < name.length; index++) {
            System.out.print("Team name?:");
            name[index] = keyboard.next();
            System.out.print("Points?:");
            points[index] = keyboard.nextInt();
            System.out.print("Goals scored?:");
            nM[index] = keyboard.nextInt();
            System.out.print("Goals received?:");
            nR[index] = keyboard.nextInt();
        }

    }

    private static void p2() {
        
        for (index = 0; index < nteams; index++) {
            if (points[index] > maxValue) {
                maxValue = (int) points[index];
                positionMax = index;
            }
        }
        System.out.println("The winner team in the league is " + name[positionMax] + " with " + points[positionMax] + " points");
        positionWinner = positionMax;
    }

    private static void p3() {
          int positionMax2 = 0;
          int maxValue2=5; //also can be int maxValue2= points[0];
        for (index = 0; index < nteams; index++) {
            if (points[index] > maxValue2 && index != positionWinner) {
                maxValue2 = (int) points[index];
                positionMax2 = index;
            }
        }
        System.out.println("The second winner team in the league is " + name[positionMax2] + " with " + points[positionMax2] + " points");
    }

    private static void p4() {
        for (index = 0; index < nteams; index++) {
            if (nR[index] < minValue) {
                minValue = (int) nR[index];
                positionMin = index;
            }
        }
        System.out.println("The best defensive team  is " + name[positionMin] + " with " + nR[positionMin] + " goals received");
    }

    private static void p5() {
        for (index = 0; index < nteams; index++) {
            if (nM[index] > maxValue) {
                maxValue = (int) nM[index];
                positionMax = index;
            }
        }
        System.out.println("The best offensive team  is " + name[positionMax] + " with " + nM[positionMax] + " goals scored");

    }

    private static void p6() {
        double sumPointsM = 0;
        double averageM = 0;
        double sumPointsR = 0;
        double averageR = 0;
        for (index = 0; index < nteams; index++) {
            sumPointsM += nM[index];
            averageM = sumPointsM / nteams;
        }

        System.out.println("Average scored goals in the league:" + averageM);

        for (index = 0; index < nteams; index++) {
            sumPointsR += nR[index];
            averageR = sumPointsR / nteams;
        }

        System.out.println("Average received goals in the league:" + averageR);
    }

    private static void p7() {
        for (index = 0; index < nteams; index++) {
            if (points[index] < maxValue) {
                maxValue = (int) points[index];
                positionMax = index;
            }
        }
        System.out.println("The descendant team of the league is " + name[positionMax] + " with " + points[positionMax] + " points");
    }

    private static void p8() {
        for(int index=0; index<nteams;index++){
            System.out.println("The team:"+name[index]);
            System.out.println("Points:"+ points[index]);
            System.out.println("Goals scored:"+nM[index]);
            System.out.println("Goals received:"+nR[index]);
            System.out.println("Goal difference:"+(nM[index]-nR[index]));
            System.out.println("---------------------------");
        }

    }

    private static void p9() {
        int diffGoals = 0;
        for (index = 0; index < nteams; index++) {

            diffGoals = nM[index] - nR[index];
            System.out.println("Goal difference of " + name[index] + " is " + diffGoals + " goals");
        }

    }

    private static void p10() {
        String answer;
        System.out.println("Are you sure?");
        answer = keyboard.next();
        if (answer.equals("yes")) {
            System.out.println("");
            System.out.println("Okey,bye");
            System.out.println("See you soon");
            System.exit(0);
        }
    }
}
