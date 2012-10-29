package learn.coreJava.ary; 
 import java.util.Scanner; 

public class P67M{
    public static void main(String[]args){
        Scanner ams = new Scanner(System.in);
		int maks[];
		maks = new int[3];
		// To Take Input  
		for( int i=0;i<3;i++){
		 System.out.println("Enter the index "+i+ "marks");
		 maks[i] = ams.nextInt();
        }
		// To Print Input --Using Normal For Loop 
		for( int i=0;i<3;i++){
		 System.out.println("Value of index "+i+ " marks :" + maks[i]);
		P67 pObj = new P67();
		int ans;
		ans= pObj.maximum(maks);
		System.out.println("The maximum value is "+ ans);
		int a;
		a= pObj.minimum(maks);
		System.out.println("The minimum value is"+ a);
	    }
		
		/*
		// To Print Output USING Enhanced For LOOP
		for( int k:maks ){
		 // k:maks means k=maks[0] AND Loop Until ARRAY is Empty i.e i<3
		    System.out.println("Value of maks of index"+k + "is : ");//+maks[k]);
		}
		 */    
		
		
	}
}

