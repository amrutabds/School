package basic.contnu;

public class MK {
	public static void main(String[]args){
    Outer:
	for(int var1 =0; var1 < 2 ; var1++)
	{
	 
	        for(int var2=0 ; var2 < 3 ; var2++)
	        {
	                if(var2 == 1){
	                	System.out.println("Now in Break");
	                	continue;
	                }
	                
//	                        continue Outer;
	 
	                System.out.println("var1:"+ var1 + ", var2:"+ var2);
	 
	        }
	 
	}
 }
	
}
