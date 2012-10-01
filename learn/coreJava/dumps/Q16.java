//Click the Exhibit button.
10. interface Foo {
11. int bar();
12. }
13.
14. public class Q16 {
15.
16. class A implements Foo {
17. public int bar() { return 1; }
18. }
19.
20. public int fubar( Foo foo) { return foo.bar(); }
21.
22. public void testFoo() {
23.
24. class A implements Foo {
25. public int bar() { return 2; }
26. }
27.
28. System.out.println( fubar( new A()));
29. }
30.
31. public static void main( String[] argv) {
32. new Beta().testFoo();
33. }
34. }
/*Which three statements are true? (Choose three.)
A. Compilation fails.
B. The code compiles and the output is 2.
C. If lines 16, 17 and 18 were removed, compilation would fail.
D. If lines 24, 25 and 26 were removed, compilation would fail.
E. If lines 16, 17 and 18 were removed, the code would compile and
the output would be 2.
F. If lines 24, 25 and 26 were removed, the code would compile and
the output would be 1.
Answer: BEF*/