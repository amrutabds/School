package learn.inter.one; 

interface Health{
    // 1 ) An interface can NOT have concrete method. 
	//      this is  POSSILBE in Abstract class.
	// 2 ) 
	// 3 ) it is mandatory that the Child/Sub class overrides the color method. 
	// 4 ) An abstract keyword is NOT Required for the color method below, 
	//       this is required in Abstract Methods  becuase it can have concrete methods as well.
	
	int price2=20;	
	public void hlth();
}

/*here the child classes did not override the hlth mtd,but still it compiled.why?*/
