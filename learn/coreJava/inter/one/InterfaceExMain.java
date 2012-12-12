package learn.coreJava.inter.one; 
/*
* This program demonstrates Abstract Class Example 
*/ 
public class InterfaceExMain{
    public static void main(String[]args){
			System.out.println("---------INTEffffRFACE EXAMPLE MAIN METHOD---------");
			// Case 1 -- CALLING money METHOD by using FATHER Object and See the Output.
			System.out.println("Because Chicken is Sub class of Health , Food Class can hold Chicken Object");
			Health hObjChicken = new Chicken();
			hObjChicken.color();
			// Case 2 -- Now assinging the Mutton Object to FOOD.			
			hObjChicken = null;
			hObjChicken = new Mutton();
			hObjChicken.color();
			System.out.println("----------------------------------------");
	
	}
}