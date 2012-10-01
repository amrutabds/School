Given:
1. class TestA {
2. public void start() { System.out.println(”TestA”); }
3. }
4. public class TestB extends TestA {
5. public void start() { System.out.println(”TestB”); }
6. public static void main(String[] args) {
7. ((TestA)new TestB()).start();
8. }
9. }
What is the result?
A. TestA
B. TestB
C. Compilation fails.
D. An exception is thrown at runtime.
Answer: B