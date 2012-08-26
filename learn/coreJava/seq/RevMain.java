package learn.seq;
import java.util.Scanner;
    public class RevMain{
        public static void main(String[]args){
		  int num;
		  Scanner ams= new Scanner(System.in);
		   Rev rObj= new Rev();
		   System.out.println(" Enter a value");
		   num= ams.nextInt();
		 //rObj.rev(num);
		 rObj.reverse(num);
		 }
    }