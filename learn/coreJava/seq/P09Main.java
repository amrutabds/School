
package learn.seq;
import java.util.Scanner;
    public class P09Main{
        
		public static void main(String ru[]){
		
		    Scanner ams = new Scanner(System.in);  
	        int a,b,c;
	        System.out.println(" Enter a Value : ");
		    a = ams.nextInt();
		    System.out.println(" Enter b Value : ");
		    b= ams.nextInt();
			System.out.println(" Enter  c Value : ");
		    c = ams.nextInt();
		    P09 pObj = new P09();
	        pObj.calc(a,b,c);
		 }   
    }