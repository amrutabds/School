Given:
1. package sun.scjp;
2. public enum Color { RED, GREEN, BLUE }
1. package sun.beta;
2. // insert code here
3. public class Beta {
4. Color g = GREEN;
5. public static void main( String[] argv)
6. { System.out.println( GREEN); }
7. }
The class Beta and the enum Color are in different packages.
Which two code fragments, inserted individually at line 2 of the Beta
declaration, will allow this code to compile? (Choose two.)
A. import sun.scjp.Color.*;
B. import static sun.scjp.Color.*;
C. import sun.scjp.Color; import static sun.scjp.Color.*;
D. import sun.scjp.*; import static sun.scjp.Color.*;
E. import sun.scjp.Color; import static sun.scjp.Color.GREEN;
Answer: CE