package learn.coreJava.seq;
import java.util.Scanner;
    public class P01Main{
        public static void main(String[]args){
		  int mat,scn,soc;
		   Scanner ams= new Scanner(System.in);
		   P01 pObj= new P01();
		   System.out.println(" Enter ur maths marks");
		   mat= ams.nextInt();
		   System.out.println(" Enter ur science marks");
		   scn= ams.nextInt();
		   System.out.println(" Enter ur social marks");
		   soc= ams.nextInt();
		   pObj.tot(mat,scn,soc);
		
		
		}
  
    }
  
  
  
  
  
    