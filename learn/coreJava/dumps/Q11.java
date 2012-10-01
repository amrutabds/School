 public class Q11{
    public static void main(String [] args) {
	
	
	Object [] myObjects = {
    new integer(12),
    new String("foo"),
    new integer(5),
    new Boolean(true)
    };
    Arrays.sort(myObjects);
    for( int i=0; i<myObjects.length; i++) {
     System.out.print(myObjects[i].toString());
     System.out.print("");
    }
	
    }
}	
	//C. A ClassCastException occurs in line 11