
package learn.coreJava.seq;

import java.util.Scanner;;


class fibo{

    public static void main(String[] args){

     int[] fib=new int[100];
     fib[0]=0;
     fib[1]=1;
     int num;
     int i;
     Scanner ams= new Scanner(System.in);
		   
		   System.out.println(" Enter a value");
		   num= ams.nextInt();

        if(num>1){
            System.out.println("Ur fibonaci series is:  ");
            System.out.println(fib[0]);
			System.out.println(fib[1]);
			
			for(i=2;i<num;i++){
             fib[i]=fib[i-1]+fib[i-2];
            System.out.println(fib[i]);
			
			
            }
        }

   }

}