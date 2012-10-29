package learn.coreJava.seq;
import java.util.Scanner;
    class P10Main{
        public static void main(String[]args){
		  Scanner ams = new Scanner(System.in);
		  double x,y,ans;
		  System.out.println("Print x value FOR SWAPPING:");
		  x =ams.nextDouble();
		  System.out.println("Print y value FOR SWAPPING:");
		  y =ams.nextDouble();
		  P10 pObj= new P10();
       		  
		  ans = pObj.swap(x,y);
		  System.out.println("The swapped values of y is:" + ans);
		
		}
 
    }