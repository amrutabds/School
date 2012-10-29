package learn.coreJava.abst.one; 

abstract public class Food{
    // 1 ) An abstract class can have concrete method as well. 
	//      this is NOT POSSILBE in INTERFACES.
	// 2 )****We CANT create an INSTANCE(OBJECT) for an abstract class. 
	// 3 ) it is MANDATORY that the Child/Sub class OVERRIDES the color method. 
	// 4 ) An abstract keyword is must for the color method below, 
	//       this is NOT required in INTERFACES becuase all are abstract methods only .
	public void eat(){
		System.out.println("This is eat method in FOOD class ");
	}
	abstract public void color();
	/* Doubts: how abt abstract key word for the eat mtd and no abstract for the color mtd if we dont take them by meaning??*/
}
