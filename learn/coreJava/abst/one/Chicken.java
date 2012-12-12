package learn.coreJava.abst.one; 

public class Chicken extends Food{
    // Overriding color is MUST HERE .. 
	public void color(){
		System.out.println(" This is CHICKEN COLOR -IF we dont implement this color method U will get a compiler error");
	}
}