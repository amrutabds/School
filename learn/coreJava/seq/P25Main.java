package learn.coreJava.seq;
import java.util.Scanner;

 import java.util.Scanner;
class P25Main{
    public static void main(String args[]){
		int counter,even;
		counter = 0;
		System.out.print("The even numbers are : ");
		while (counter <50) {
			counter++;	     
			even = 2 * counter;
			System.out.println(even);
		}
	}
}