package PK_EDGAR;

import java.io.BufferedWriter;
import java.io.File;
import static java.io.File.separator;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P20 {
//Global Declarations

    static Scanner keyboard = new Scanner(System.in);
    static String separador;
    static String folderPath;
    
    public static void main(String[] args) throws IOException {
        int option = -1;
        String fileName,text;
        keyboard.useDelimiter("\n");
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//init of switch 
                case 1:
                    createFolder("Rosa-Monlau");
                    break;
                case 2:
                    System.out.print("Name of File?:");
                    fileName=keyboard.next();
                    System.out.println("Text?:");
                    text=keyboard.next();
                    fileName= folderPath + separator+ fileName+ ".txt"; // builder the absolute path
                    
                    createFile(fileName, text);
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

        } while (option != 0);

    }

    private static void userMenu() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Number 1-10");
        System.out.println("Option1: Create Folder");
        System.out.println("Option2: Create File");
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

    public static void createFile(String fileName, String text) throws IOException {
        //1-Open file:
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        //2-Write in file:
        bw.write(text);
        //3-Close file
        bw.flush();//limpiar la memoria
        bw.close();
    }

    public static void createFolder(String name) {
        String path = System.getProperty("user.dir"); //current path
       // System.out.println("path= " + path);
        separador = File.separator; //OS order: \
        folderPath = path + separator + name;
        File folder = new File(folderPath); //format the folder path
        //System.out.println(folderPath);
        if(!folder.exists()) folder.mkdir(); 
        
    }


    private static void p3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p8() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p9() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p10() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
