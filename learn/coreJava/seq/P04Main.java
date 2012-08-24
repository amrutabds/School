package learn.seq;

import java.util.Scanner;

class P04Main{
	  public static void main(String arg[]){
		Scanner ams = new Scanner(System.in);
		int value,anil,prem;
		System.out.println("Enter the number");
		anil= ams.nextInt();
		prem = 2* anil;
		value =anil - prem;
		System.out.println("The changed value =" + value);
	  }
	}