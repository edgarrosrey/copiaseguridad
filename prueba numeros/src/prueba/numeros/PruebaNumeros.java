/*
04/10/19
 */
//Author: Edgar
package prueba.numeros;

public class PruebaNumeros {

    public static void main(String[] args) {
    int numInt=88;
    int num2Int=7;
    //float div=1.0f*numInt/num2Int;
     //float div=(float)numInt/num2Int;
      //float div=(float)numInt/(float)num2Int;
       float div=numInt/(float)num2Int;
        System.out.println(numInt+"/"+num2Int+"="+div);
        int sec,min,sec2;
        System.out.println("Number of seconds");
        sec=100;
        min=sec/60;
        sec2=sec % 60;
        System.out.println(sec+"seconds="+min+"minutes and"+sec2+"seconds");
        
        float dist,kmh;
        int hh, mm, ss,time=3740;
        //time=(int)(dist/kmh*3600); //seg
        hh=time/3600;
        time=time%3600;
        mm=time/60;
        ss=time%60;
        System.out.println(hh+":"+mm+":"+ss);
    }
    
}
