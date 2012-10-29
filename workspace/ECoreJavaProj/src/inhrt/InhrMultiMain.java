package learn.inhrt;
public class InhrMultiMain{//inheritence at multiple level
	public static void main(String[]args){
	GrandSon obj=new GrandSon();
	obj.display();
	obj.write();
	obj.read();
	}
}
class Father{
      public void display(){
	   System.out.println("Printing from Father class");
	 }
}
 class Child extends Father{
     public static void write(){
	 System.out.println("Printing from Child class");
	 }
}
 class GrandSon extends Child{
     void read(){
	 System.out.println("Printing from GrandSon class");
	 }
}