package learn.coreJava.ary;
import java.util.Scanner;
class P64M{
    public static void main(String[]args){
       int[]x;
	   Scanner ams= new Scanner(System.in);
	   x= new int [10];
	  for(int i=0;i<x.length;i++){
	   System.out.println("Enter ur index"+i+"marks");
	   x[i]= ams.nextInt();
	  }for( int i=0;i<x.length;i++){
	  System.out.println("Value of index "+i+ " marks :" + x[i]);
	  }
	    int max = x[0];
	    for (int i=0;i<x.length;i++){
	        if (x[i]>max){
		    max=x[i];
		    System.out.println("The maximum value is"+ max);
		    }
		}
	  
	  
	  
	}
}
