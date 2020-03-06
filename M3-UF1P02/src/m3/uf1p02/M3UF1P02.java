/*
30/09/19
 */
//Author: Edgar
package m3.uf1p02;
//Libraries:
import java.util.Scanner;
public class M3UF1P02 {
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
     P2_3();                                                                  
    }
    public static void P2_3(){
        //Ask for the name, surname and city of the user
       String name, surnames, city;
       System.out.print("Name ?:");
       name= keyboard.next();
       System.out.print("Surnames ?:");
       surnames= keyboard.next();
       System.out.println("What city do you live? ");
       city=keyboard.next();
       //Ask the distance in km of your city from Barcelona
        System.out.println("How many km are you from bcn?");
        int km= keyboard.nextInt();
        float yards, miles;
        yards= km*1093.61f;
        miles= km*0.621371f;
        System.out.println(surnames + name + " live in "+ city +" the distance respect to Barcelona is "+km+ " km="+yards+ " yards="+miles+ " miles");
        
}           
}



