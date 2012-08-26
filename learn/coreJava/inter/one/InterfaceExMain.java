package learn.inter.one; 
/*
* This program demonstrates Abstract Class Example 
*/ 
public class InterfaceExMain{
    public static void main(String[]args){
			System.out.println("---------INTEffffRFACE EXAMPLE MAIN METHOD---------");
			// Case 1 -- CALLING money METHOD by using FATHER Object and See the Output.
			System.out.println("Because Chicken is Sub class of FOOD , Food Class can hold Chicken Object");
			Food fObjChicken = new Chicken();
			fObjChicken.color();
			// Case 2 -- Now assinging the Mutton Object to FOOD.			
			fObjChicken = null;
			fObjChicken = new Mutton();
			fObjChicken.color();
			System.out.println("----------------------------------------");
	}
}