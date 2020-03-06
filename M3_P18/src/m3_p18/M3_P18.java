/*
17/02/20
 */
//Author: Edgar
package m3_p18;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class M3_P18 {
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
                    // Declare array with values 7,12,13,16,18
                    int[] arrayInt = new int[]{7, 12, 13, 16, 18};
                    viewArray1(arrayInt);
                    break;
                case 2:
                    //Dimension and give values later
                    int[] arrayIVA;
                    arrayIVA = new int[]{0, 4, 10, 21};
                    viewArray1(arrayIVA);
                    break;
                case 3:
                    //Dimension and give values later, one by one
                    int[] arrayIVA2 = new int[4];
                    arrayIVA2[0] = 0;
                    arrayIVA2[1] = 4;
                    arrayIVA2[2] = 10;
                    arrayIVA2[3] = 21;
                    viewArray1(arrayIVA2);
                    break;
                case 4:
                    //Declare an array and then dimension and give values
                    int[] arrayN;
                    System.out.print("Dimension?:");
                    int D = keyboard.nextInt();
                    arrayN = new int[D];
                    for (int i = 0; i < arrayN.length; i++) {
                        System.out.println("Price[" + i + "]");
                        arrayN[i] = keyboard.nextInt();
                    }

                    viewArray1(arrayN);
                    break;
                case 5:
                    double[] arrayHeight;
                    int numStudents;
                    String[] arrayName;
                    System.out.print("Number of students?:");
                    numStudents = keyboard.nextInt();
                    arrayHeight = new double[numStudents];
                    arrayName = new String[numStudents];
                    viewArrayHeight(arrayHeight, arrayName);

                    break;
                case 6:
                    double[] arrayHeight2;
                    int numStudents2;
                    String[] arrayName2;
                    System.out.print("Number of students?:");
                    numStudents2 = keyboard.nextInt();
                    arrayHeight2 = new double[numStudents2];
                    arrayName2 = new String[numStudents2];
                    viewDifStudents(arrayHeight2, arrayName2, numStudents2);

                    break;
                case 7:
                    int num;
                    String[] daysWeek = new String[8];
                    daysWeek[0] = null;
                    daysWeek[1] = "Monday";
                    daysWeek[2] = "Tuesday";
                    daysWeek[3] = "Wednesday";
                    daysWeek[4] = "Thursday";
                    daysWeek[5] = "Friday";
                    daysWeek[6] = "Saturday";
                    daysWeek[7] = "Sunday";
                    System.out.print("Number?:");
                    num = keyboard.nextInt();
                    viewDaysWeek(num, daysWeek);
                    break;
                case 8:
                    int dni;
                    String letter[] = new String[23];
                    System.out.print("DNI?:");
                    dni = keyboard.nextInt();
                    int n = dni % 23;
                    letter[0] = "T";
                    letter[1] = "R";
                    letter[2] = "W";
                    letter[3] = "A";
                    letter[4] = "G";
                    letter[5] = "M";
                    letter[6] = "Y";
                    letter[7] = "F";
                    letter[8] = "P";
                    letter[9] = "D";
                    letter[10] = "X";
                    letter[11] = "B";
                    letter[12] = "N";
                    letter[13] = "J";
                    letter[14] = "Z";
                    letter[15] = "S";
                    letter[16] = "Q";
                    letter[17] = "V";
                    letter[18] = "H";
                    letter[19] = "L";
                    letter[20] = "C";
                    letter[21] = "K";
                    letter[22] = "E";
                    letterDni(dni,letter,n);
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                    break;
                default:
                    System.out.println("Invalid Option ....");
            }//end of switch
            //System.out.println("press any key to continue");
            //String key=keyboard.next();

        }
    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Option1:(Numeros de 0 a 11):");
        System.out.println("Option2:");
        System.out.println("Option3:");
        System.out.println("Option4:");
        System.out.println("Option5:");
        System.out.println("Option6:");
        System.out.println("Option7:");
        System.out.println("Option8:");
        System.out.println("Option9:");
        System.out.println("Option10: (exit)");

        System.out.println("\n\noption ?");
    }

    private static void viewArray1(int[] arrayInt) {
        int i;
        for (i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }

    private static void viewArrayHeight(double[] arrayHeight, String[] arrayName) {
        int index;
        String name;
        double height, average;
        for (index = 0; index < arrayName.length; index++) {
            System.out.print("Name " + (index + 1) + "?:");
            arrayName[index] = keyboard.next();
            System.out.println(arrayName[index]);

            System.out.print("Height " + (index + 1) + "?:");
            arrayHeight[index] = keyboard.nextDouble();
            System.out.println(arrayHeight[index]);
        }

    }

    private static void viewDifStudents(double[] arrayHeight2, String[] arrayName2, int numStudents2) {

        String name;
        double height, average = 0, sumHeight = 0;

        int maxValue = 0, minValue = 10, positionMax = 0, positionMin = 0, index;
        for (index = 0; index < arrayName2.length; index++) {
            System.out.print("Name " + (index + 1) + "?:");
            arrayName2[index] = keyboard.next();
            System.out.println(arrayName2[index]);

            System.out.print("Height " + (index + 1) + "?:");
            arrayHeight2[index] = keyboard.nextDouble();
            System.out.println(arrayHeight2[index]);
            sumHeight += arrayHeight2[index];
            average = sumHeight / numStudents2;
        }
        for (index = 0; index < arrayHeight2.length; index++) {
            if (arrayHeight2[index] > maxValue) {
                maxValue = (int) arrayHeight2[index];
                positionMax = index;
            }
            for (index = 0; index < arrayHeight2.length; index++) {
                if (arrayHeight2[index] < minValue) {
                    maxValue = (int) arrayHeight2[index];
                    positionMin = index;
                }
            }
            System.out.println("Highest height is " + arrayName2[positionMin] + " with " + arrayHeight2[positionMin]);
            System.out.println("Lower height is " + arrayName2[positionMax] + " with " + arrayHeight2[positionMax]);
            System.out.println("Above average student:");
            for (index = 0; index < arrayHeight2.length; index++) {
                if (arrayHeight2[index] > average) {
                    System.out.println("" + arrayName2[index] + " " + arrayHeight2[index]);
                }

            }
        }

    }

    private static void letterDni(int dni,String letter[],int n) {
  System.out.println(dni + ": " + letter[n]);
    }

    private static void p9() {
        System.out.println("Option 9:");

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
        } else {
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("Option1:(Numeros de 0 a 11):");
            System.out.println("Option2:");
            System.out.println("Option3:");
            System.out.println("Option4:");
            System.out.println("Option5:");
            System.out.println("Option6:");
            System.out.println("Option7:");
            System.out.println("Option8:");
            System.out.println("Option9:");
            System.out.println("Option10: (exit)");

            System.out.println("\n\noption ?");

        }

    }

    private static void viewDaysWeek(int num, String[] daysWeek) {
        System.out.println(daysWeek[num]);
    }

}
