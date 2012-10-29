public class Q2 {
    static void foo(int...x) {
      for(int z : x) System.out.println(z);
 }
}

//this will compile but not RUN! as no Main mtd exists