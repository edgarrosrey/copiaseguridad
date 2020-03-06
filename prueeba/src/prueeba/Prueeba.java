/*
27/09/19
 */
package prueeba;
//Librerias:
import java.util.Scanner;


//author: Edgar
public class Prueeba {
//global declaration: (todo en ingles)
    //keyboard declare
  static Scanner keyboard = new Scanner(System.in);
            
            
    public static void main(String[] args) {
      System.out.print("Name ?:");
       String name= keyboard.next();
        System.out.println("welcome "+ name);
        System.out.println( name +" how old are you?");
        int dataInt= keyboard.nextInt();
        System.out.println( name + " have "+ dataInt +" years old");
        //Javier tienes 19 años
    }
    
}
