import java.util.Scanner;

import static java.lang.Math.sqrt;

public class printPrime {

 public static void main(String args[]) {
     boolean flag;
     for(int i = 2; i <= 999999;i++){
         flag = false;
        for (int j = 2; j < Math.sqrt(i);j++){
            if(i%j == 0){
                flag = true;
                break;
            }
        }if(!flag){
            System.out.print(i+ "  ");
        }
     }
   }
 }
