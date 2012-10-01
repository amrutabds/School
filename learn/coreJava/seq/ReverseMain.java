package learn.coreJava.seq;
import java.util.Scanner;
   
	/*
  Reverse Number using Java
  This Java Reverse Number Example shows how to reverse a given number.
*/
 
public class ReverseMain {
 
		public static void main(String[] args) {
               
             
		    int num;
		    Scanner ams= new Scanner(System.in);
		    System.out.println(" Enter any number");
		    num= ams.nextInt();
		   rev(num); 
		           //OR u can also do like this:))
		           //int num;
		           //Scanner ams= new Scanner(System.in);
		          //ReverseMain rObj= new ReverseMain();
		          //System.out.println(" Enter any number");
		         //num= ams.nextInt();
		         //rObj.rev(num);

		}
        public static void rev(int num){
                int number = num;
                int reversedNumber = 0;
                int temp = 0;
               
                while(number > 0){
                       
                        //use modulus operator to strip off the last digit
                        temp = number%10;
                       
                        //create the reversed number
                        reversedNumber = reversedNumber * 10 + temp;
                        number = number/10;
                         
                }
               
                //output the reversed number
                System.out.println("Reversed Number is: " + reversedNumber);
        }
}
 
/*
Output of this Number Reverse program would be
Reversed Number is: 4321
*/