package learn.coreJava.seq;
import java.util.Scanner;
class P26Main{
    public static void main(String[]args){
		int counter,odd;
		counter = 0;
		System.out.print("The odd numbers are : ");
		while (counter < 100) {
			counter++;	     
			odd = counter % 2 ;
			if (odd == 1){
	   		   System.out.println(counter);
			}
			 
	     
	   }
	}
}