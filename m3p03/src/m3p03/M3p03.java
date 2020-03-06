/*
04/10/19
 */
//Author: Edgar
package m3p03;
//Libraries:
import java.util.Scanner;
public class M3p03 {
// Global Declarations:
static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
       P4();
    }
    public static void P4(){
  String numBinary1,numBinary2;
  System.out.print("Input first binary number:");
  numBinary1=keyboard.next();
  System.out.print("Input second binary number:");
  numBinary2=keyboard.next();
  //convert binary(string) to Int
  int num1=Integer.parseInt(numBinary1,2);
  int num2=Integer.parseInt(numBinary2,2);
  //sum
  int sum=num1+num2;
  //convert int to Binary
  String sumBinary=Integer.toBinaryString(sum);
  System.out.println(numBinary1+"+"+numBinary2+"="+sumBinary);
  
}     
}
