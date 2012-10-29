package learn.exc;

import java.util.Scanner;
public class ErrorMain{
	public static void main(String ru[]){
		System.out.println(" Executing LINE 1 ");
		System.out.println(" ENTER a,b Values ");
		int a=0,b=0,res=0;
		Scanner ams= new Scanner(System.in);
	    a=ams.nextInt();
		b=ams.nextInt();
		System.out.println("Now Doing the Division");
		System.out.println(" Executing LINE 2 ");
		try{		
		res=a/b;
		System.out.println(" Executing LINE 2.5 ");			
		}catch(Exception e){
		// This block when some problems happens+                
		
		//Ingeneral Used for Alternate Solution.
		System.out.println("Exception OCCURED ");
		b=2;
		res=a/b;		
		} 
		finally{
		System.out.println(" I WILL ALWAYS Excecute..");
		}	
		System.out.println(" Executing LINE 3 ");
		System.out.println(" RESULT OF a/b is : "+ res);
	}
}