package learn.seq;
 import java.util.Scanner;
    public class P08Main{
        
		public static void main(String ru[]){
		
		    Scanner ams = new Scanner(System.in);  
	        int a,b,c,ans;
	        System.out.println(" Enter a Value : ");
		    a = ams.nextInt();
		    System.out.println(" Enter b Value : ");
		    b= ams.nextInt();
			System.out.println(" Enter  c Value : ");
		    c = ams.nextInt();
		    P08 pObj = new P08();
	        ans= pObj.calc(a,b,c);
		    System.out.println("The answer is "+ ans);
		}
    }