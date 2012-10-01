package learn.coreJava.seq;
import java.util.Scanner;
    public class P02Main{
        public static void main(String[]args){
		  double rice,wheat,mango;
		  Scanner ams= new Scanner(System.in);
		   P02 pObj= new P02();
		   System.out.println(" Enter rice price");
		   rice= ams.nextDouble();
		   System.out.println(" Enter wheat price");
		   wheat= ams.nextDouble();
		   System.out.println(" Enter mango price");
		   mango= ams.nextDouble();
		   pObj.tot(rice,wheat,mango);
		   
		}
    }