interface Foo { int bar(); }
 public class Q15 {
 public int fubar( Foo foo) { return foo.bar(); }
 public void testFoo() {
    fubar(
 // insert code here
     newFoo() { public int bar(){return 1; } }
    );
 }
 }



/*Which code, inserted at line 15, allows the class Sprite to compile?
A. Foo { public int bar() { return 1; } }
B. new Foo { public int bar() { return 1; } }
C. newFoo() { public int bar(){return 1; } }
D.new class Foo { public int bar() { return 1; } }*/