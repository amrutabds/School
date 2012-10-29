package learn.coreJava.ary; 
  import java.util.Scanner;

public class Charactr{
    public static void main(String[]args){
        Scanner ams = new Scanner(System.in);
		
		char[] x={'a','n','i','l'};
	       for (int i=0;i<x.length;i++){
	        System.out.println(" alphabets number "+ i +"="+x[i]);
	        }
	        try {
			for (int i=3;i<x.length;i--){
	        System.out.println("  rev alphabets number "+ i +"="+x[i]);
	        }
			}catch(Exception e){
			System.out.println("Exception occured"+e);
			}
			 finally{
			 System.out.println("The finally block always executes");
			 }
			
	
	
	
	}
}