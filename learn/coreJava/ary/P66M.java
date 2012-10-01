package learn.coreJava.ary;
import java.util.Scanner;

class P66M{
    public static void main(String[]args){
     Scanner ams = new Scanner(System.in);
     int x[] ;
     x= new int[3];	 
     for (int i =0;i<x.length;i++){
	 System.out.println("Enter index"+i+ "marks");
	 x[i]= ams.nextInt();
	    }for(int i=0;i<x.length;i++){
	     System.out.println("The marks of index"+i+":"+x[i]);
	    }
     
    int y[] ;
     y= new int[3];	 
     for (int i =0;i<y.length;i++){
	 System.out.println("Enter index"+i+ "marks");
	 y[i]= ams.nextInt();
	    }for( int i=0;i<y.length;i++){
	     System.out.println("The marks of index "+i+":"+y[i]);
	     }
     
    int z[];
	z= new int [3];
	    
	    z[2]= x[0]+y[0];
	    System.out.println("total of indices of first element of first and second sets:"+z[2]);
	    
	
   }
 }