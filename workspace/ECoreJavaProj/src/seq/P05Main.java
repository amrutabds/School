package learn.coreJava.seq;

import java.util.Scanner;
    public class P05Main{
        
		public static void main(String ru[]){
		
		    Scanner ams = new Scanner(System.in);  
	        int min,hrs,days;
	        System.out.println(" Enter Value in minutes : ");
		    min= ams.nextInt();
		   
		
		    P05 pObj = new P05();
	        hrs= pObj.hours(min);
		    System.out.println("The answer in hours is" +  hrs);
			days = pObj.deys(hrs);
		    System.out.println("The answer in days is" +  days);
		}	
    }