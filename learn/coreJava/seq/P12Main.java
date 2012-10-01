package learn.coreJava.seq;
import java.util.Scanner;
class P12Main{
    public static void main(String[]args){
      int a,b,ans;
	  Scanner ams = new Scanner(System.in);
      System.out.println("Enter a value");
      a= ams.nextInt();
	  System.out.println("Enter b value");
      b= ams.nextInt();
	  P12 pObj = new P12();
	  pObj.max(a,b);
	  ans=pObj.max(a,b);
	  System.out.println("The biggest of the two numbers is ;" + ans);
	}

}