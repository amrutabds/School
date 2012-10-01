package learn.coreJava.seq;
import java.util.Scanner;
class P29Main{
	public static void main(String[]args){
		Scanner ams = new Scanner(System.in);
		int x,p,ans=1,count =1;
		System.out.println(" enter x value");
	    x = ams.nextInt();		 
	    System.out.println(" enter p value");
	    p = ams.nextInt();
        while(count<= p){
		   ans=ans*x;
		   count++;
		}
	    System.out.println("The answer is:" + ans);
	    factorial(ans);
	}
    public static void factorial(int ans){
	    int counter=1;
	    int answer=1;
	    while (counter<=ans){
	        answer=answer*counter;
	        counter++;
	    }
	   System.out.println("The factorial of it is :" + answer );
	
	
	
	}
	
	
	
	
	
}