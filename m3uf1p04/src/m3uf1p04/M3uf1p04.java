/*
10/10/19
 */
//Author: Edgar
package m3uf1p04;
//Libraries:
import java.util.Scanner;
import java.text.DecimalFormat;
public class M3uf1p04 {
// Global Declarations:
static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
      P6();
    }
   public static void P6(){
       DecimalFormat df=new DecimalFormat("00");
       System.out.println("How many goals has the visiting team scored?");
       int num1=keyboard.nextInt();
       System.out.println("How many goals has the local team scored?");
       int num2=keyboard.nextInt();
       if(num1>num2){
           System.out.println("the visiting team has won");
       }
       else if (num1<num2){
           System.out.println("the local team has won");
   }
       else {
       
         System.out.println("draw");      
   }
       System.out.println(df.format(num1)+"\t"+df.format(num2));      
}
}



