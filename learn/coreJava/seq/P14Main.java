package learn.coreJava.seq;
import java.util.Scanner;
class P14Main{
   public static void main(String[]args){
    double x,y,z,t,a;
	Scanner ams = new Scanner(System.in);
	System.out.println("Enter mat marks:");
    x = ams.nextDouble();
    System.out.println("Enter scn marks:");
    y = ams.nextDouble();
    System.out.println("Enter soc marks:");
    z = ams.nextDouble();
	t = x+y+z;
	a = t/3;
	System.out.println("ur tot marks: "+ t);
	System.out.println("ur avg: "+ a);
	if (a<=50){
	System.out.println("ur class is second class");
	}else{
	System.out.println("ur class is first class");
	}
	
  }
	
	
	
}