package learn.coreJava.ary;
class P67{
    public static int maximum(int[] x){
      int max= x[0];
	    for(int i=0;i<x.length;i++){
	        if(x[i]>max){
		     max= x[i];
		    }
	    }return max;
    
	}  
    public static int minimum(int[]y){	
		int min=y[0
		 ];
		for(int i=0;i<y.length;i++){
	        if(y[i]<min){
		     min= y[i];
		    }
	    }return min;


    }
}