
 public class Q12 {
    public static void main(String [] args) {
    int x =5;
    Q12 p = new Q12();
    p.doStuff(x);
    System.out.print("main x = "+ x);
    }

    void doStuff(int x) {
       System.out.print("doStuff x = "+ x++);
    }
}

//output is 5 and 5.It will print 6 if it was ++x.(x++ means first it prints x and then adds 1 to it in the memory)
