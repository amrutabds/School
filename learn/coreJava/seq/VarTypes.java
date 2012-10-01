package learn.coreJava.seq;
import java.util.Scanner;
class VarTypes{
int a,b;        // instance variable
static int c,d; // static variables
	public void display(){
      int ans;  //local variables
	  System.out.println(" a value: "+ a);
      System.out.println(" b value: "+ b);
      ans =a+b;
	  System.out.println("The total: "+ ans);
	}
    public static void show(){
	  System.out.println(" c value : "+ c);
      System.out.println("d value : "+ d);
	}
}