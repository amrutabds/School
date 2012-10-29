package learn.coreJava.ary;
 
 import java.util.Scanner;

public class ArrayEx{
	/*public static void main(String args[]){
	 	  
	 int[] mar={69,65,89};
	 System.out.println(" First Student is "+mar[0]);
     System.out.println(" 2irst Student is "+mar[1]);
     System.out.println(" 3irst Student is "+mar[2]); 	 
	}
	public static void main(String args[]){
	 Scanner ams = new Scanner(System.in);
	 int[]mar;
	 mar = new int [3];
	 System.out.println("Enter first subject marks");
	 mar[0]= ams.nextInt();
	 System.out.println("Enter second subject marks");
	 mar[1]= ams.nextInt();
	 System.out.println("Enter third subject marks");
	 mar[2]= ams.nextInt();
	 System.out.println("first subject marks= "+ mar[0]);
	 System.out.println("second subject marks= "+ mar[1]);
	 System.out.println("third subject marks= "+ mar[2]);
	}*/
	public static void main(String args[]){
	    int[] mar;
		int count;
	    mar = new int [3];
       	count = 0;		
		while (count <3) {
			mar[count] = 2;			
			System.out.println("The marks for  : mar ["+ count +"]  : "+ mar[count]);
            count++;			
		}
	}
	  
}