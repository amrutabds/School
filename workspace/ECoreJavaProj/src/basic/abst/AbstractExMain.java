package basic.abst;

public class AbstractExMain{
    public static void main(String[]args){
			System.out.println("---------ABSTRACT MAIN METHOD---------");
			// Case 1 -- CALLING money METHOD by using FATHER Object and See the Output.
			System.out.println("Because Chicken is Sub class of FOOD , Food Class can hold Chicken Object");
			Food fObjChicken = new Chicken();
			fObjChicken.eat();
			fObjChicken.color();
			// Case 2 -- Now assinging the Mutton Object to FOOD.			
			fObjChicken = null;
			fObjChicken = new Mutton();
			fObjChicken.eat();
			fObjChicken.color();
			System.out.println("----------------------------------------");
	}
}

