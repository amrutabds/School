package learn.seq;

import java.util.Scanner; 

 class P03Main{
    public static void main(String arg[]){
       Scanner ams = new Scanner(System.in);
		double fht,tuna,bass,cel,anil;
		System.out.println("Enter celcious degree");
		cel = ams.nextDouble();
		tuna = 32;
		bass = (10/5);
		anil = bass * cel;
		fht = anil+ tuna;
		System.out.println(bass);
		System.out.println(anil);
		System.out.println("fahrenhite=" + fht);
   
    }
  }