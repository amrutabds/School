
interface Foo {}
 class Alpha implements Foo { }
 class Beta extends Alpha {}
    class Q5 extends Beta {
        public static void main( String[] args) {
             Beta x = new Beta();
             // insert code BELOW
			 Alpha a = x;                //--compiled and run well
             //Foo f= (Q5)x;              --got EXC  
		      Foo f= (Alpha)x;            //--compiled and run welL
		     Beta b = (Beta)(Alpha)x;     //--compiled and run welL
		}
    }
	   
	 /* Which code, inserted at line 8, will cause a
java.lang.ClassCastException?
A. Alpha a = x;
B. Foo f= (Delta)x;
C. Foo f= (Alpha)x;
D. Beta b = (Beta)(Alpha)x; */