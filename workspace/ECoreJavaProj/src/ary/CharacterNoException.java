package learn.coreJava.ary; 
  import java.util.Scanner;

public class CharacterNoException{
    public static void main(String[]args){
        Scanner ams = new Scanner(System.in);
		
		char[] x={'a','n','i','l'};
	       for (int i=0;i<x.length;i++){
	        System.out.println(" alphabets number "+ i +"="+x[i]);
	        }
	       
			for (int i=3;i>-1;i--){
	        System.out.println("  rev alphabets number "+ i +"="+x[i]);
	        }
			
			
	
	
	
	}
}