package learn.ary;
import java.util.Scanner;
class SortSimpleEx{
    public static void main(String[]args){
		int[] x;int n=0;
		Scanner ams= new Scanner(System.in);
		System.out.println("Enter n value");
		n= ams.nextInt();
		x= new int [n];
		for(int i=0;i<n;i++){
		System.out.println("Enter ur index"+i+"marks");
		x[i]= ams.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("Value of index "+i+ " marks :" + x[i]);
	  	}
		System.out.println("The sorted elements r");
		
		for(int i=0;i<n;i++){
	        for (int j=i+1;j<n;j++){// z=p;p=q;q=z
		       
	           if(x[i]>x[j]){
		          int temp = x[i];
			       x[i]=x[j];
		           x[j]= temp;
		            
				}
				 
		    }
		}
		for(int k=0;k<n;k++){
			         System.out.print("\t"+x[k]);			 
        } 
	}
}

