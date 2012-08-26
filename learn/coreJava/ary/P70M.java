package learn.ary;
import java.util.Scanner;

class P70M{
    public static void main(String[]args){
      Scanner ams = new Scanner(System.in);
      int x[] ;
      x= new int[4];	 
		for (int i =0;i<x.length;i++){
		System.out.println("Enter index"+i+ "marks");
		x[i]= ams.nextInt();
	    }for(int i=0;i<x.length;i++){
	     System.out.println("The marks of index"+i+":"+x[i]);
	    }
		
		int y= x[0];
		for(int i=0;i<x.length;i++){
		   if (x[i]==y){
		    y =x[i];
			System.out.println("The number entered many times is "+y);
		   }else{
		   System.out.println("The number entered one time is "+x[i]);
		   }
		}
    }
}