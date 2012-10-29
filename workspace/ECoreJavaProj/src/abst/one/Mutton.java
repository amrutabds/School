package learn.coreJava.abst.one; 

public class Mutton extends Food{
    // Overriding color is MUST HERE .. 
	public void color(){
		System.out.println(" This is MUTTON COLOR -IF we dont implement this color method U will get a compiler error");
	}
}