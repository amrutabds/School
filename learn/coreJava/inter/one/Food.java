package learn.inter.one; 

interface Food{
    // 1 ) An interface can NOT have concrete method. 
	//      this is  POSSILBE in Abstract class.
	// 2 ) 
	// 3 ) it is mandatory that the Child/Sub class overrides the color method. 
	// 4 ) An abstract keyword is NOT Required for the color method below, 
	//       this is required in Abstract Methods  becuase it can have concrete methods as well.
	
	int price=10;	
	public void color();
}