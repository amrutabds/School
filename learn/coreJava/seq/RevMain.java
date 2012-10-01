package learn.coreJava.seq;
import java.util.Scanner;
    public class RevMain{
        public static void main(String[]args){
		  int num;
		  Scanner ams= new Scanner(System.in);
		   Rev rObj= new Rev();
		   System.out.println(" Enter 2 digit number");
		   num= ams.nextInt();
		 
		 rObj.rev(num);
		 }
    }