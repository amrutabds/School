package dumps.chap02;

/**
 * @author anil.sahu
 *
 */
public class Ex04 {
	
	public static void main(String ru[]){
		final short s1 = 1; // 1
	    final char c1 = 1;  // 2
	    byte b1 = s1;       // 3
	    byte b2 = c1;       // 4
	    byte b3 = 1;        // 5
//	    byte b4 = 1L;       // 6
//	    byte b5 = 1.0;      // 7
//	    byte b6 = 1.0d;     // 8
//	    NOTES: 6  7  8 
//	    The compiler will implicitly do a narrowing conversion for an assignment
//	    statement if the right hand operand is a compile time constant of 
//	    type byte, short, char, or int and the value falls within the range of 
//	    the variable on the left and if the variable is of type byte, short, or char. 
	}	  
}
