package learn.seq;
import java.util.Scanner;
class P13Main{
    public static void main(String args[]){
	  	
		Scanner ams = new Scanner(System.in); 
	    int a,b;
	    System.out.println("Enter the number");
	    a= ams.nextInt();
        b= a%2;
		if (b==1){
		System.out.println("The number is odd");
		}else{
		 System.out.println("The number is even");
		 }
		
	}  
	 
}