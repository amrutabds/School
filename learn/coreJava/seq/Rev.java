package learn.seq;
import java.util.Scanner;
    public class Rev{
		//HINT -- Use While Loop
        public static void rev(int num){
          int quo,rem,ans,temp;
		  quo=num/10; //8
		  rem=num%10; //1
		  temp=(rem*10); //10
		  ans=temp+quo; //18
		  System.out.println("Ur value in reverse is: "+ ans);
        }
	
	
	
        public static void reverse(int num){
          int quo=0,ans=0;
		    while (num>0){
			 quo= num/10 ;
		     ans=ans*10+rem ;
			 num=num/10 ;
		    }
			System.out.println("Ur value in reverse is: "+ ans);
			
		  
		  
		  
		  
		}
    }