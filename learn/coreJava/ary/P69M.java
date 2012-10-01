package learn.coreJava.ary;
import java.util.Scanner;
    class P69M{
	    public static void main(String[]args){
		      int[]x;
			  Scanner ams= new Scanner(System.in);
			  x= new int [3];
				for(int i=0;i<x.length;i++){
					System.out.println("Enter ur index"+i+"marks");
					x[i]= ams.nextInt();
					}
					for(int i=0;i<x.length;i++){
						System.out.println("Value of index "+i+ " marks :" + x[i]);
					}
					System.out.println("The sorted elements r");
					
					for(int i=0;i<x.length;i++){
						for (int j=i+1;j<x.length;j++){// z=p;p=q;q=z
						   
						   if(x[i]>x[j]){
							  int temp = x[i];
							   x[i]=x[j];
							   x[j]= temp;
								
							}
							 
						}
					}
					for(int k=0;k<x.length;k++){
								 System.out.print("\t"+x[k]);			 
		           } 
	}
}
