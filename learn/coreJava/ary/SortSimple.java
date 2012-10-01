package learn.coreJava.ary;
import java.util.Arrays;
import java.util.Scanner;

public class SortSimple{
	public static void main(String ru[]){
		int x[] = {20,30,10,50};
	  	sortUsingArraysUtil(x);			
	}
	//its a wrong procedure:(
	/*public static void sortUsingForLoop(int x[]){
	     
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++);
			    
				if(x[i] < x[j]){
			        int y=x[i];      				  
			        for(int k=0;k<x.length;k++){
			        System.out.print("\t"+y);
			   
			    }
						
			
            }
		
        }
		
	}*/
	public static void sortUsingArraysUtil(int x[]){
		Arrays.sort(x);
		System.out.print(" Sorted Array is :");
        for(int i=0;i<x.length;i++){
			System.out.print("\t"+x[i]);
        } 	
	}
}