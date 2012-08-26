package learn.seq;
import java.util.Scanner;
class P27Main{
    public static void main(String[]args){
		int counter,odd;
		counter = 100;
		System.out.print("The odd numbers are : ");
		while (counter >1) {
			counter--;	     
			odd = counter % 2 ;
			if (odd == 1){
	   		   System.out.println(counter);
			}
			 
	     
	    }
	}
}