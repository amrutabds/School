package learn.coreJava.seq;
import java.util.Scanner;
    public class Rev{
		//HINT -- Use While Loop
        public static void rev(int num){
          int quo,rem,ans,temp;
		  quo=num/10; //8
		  rem=num%10; //1
		  temp=(rem*10); //10
		  ans=temp+quo; //18
		  System.out.println("Ur 2 digit number in reverse is: "+ ans);
        }
	
	
	
    }
	
	
	
	