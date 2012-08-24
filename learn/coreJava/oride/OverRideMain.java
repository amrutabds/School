package learn.oride; 

/*
* This program demonstrates Overiding Example 
*/ 

public class OverRideMain{
    public static void main(String[]args){
			System.out.println("-------------------------------------");
			// Case 1 -- CALLING money METHOD by using FATHER Object and See the Output.
			System.out.println("Calling money method using Father Object");
			Father fObj = new Father();
			fObj.money();
			// Case 2 -- CALL FATHER METHOD by using FATHER and See the Output.
			System.out.println("-------------------------------------");
			System.out.println("Calling money method using SON Object");
			// Note the way the Object is created here IMPORTANT.
			Father sObj = new Son(); 
			sObj.money();
	}
}


/*why to import?*/