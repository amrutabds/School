package learn.coreJava.seq;
import java.util.Scanner;
public class VarTypesMain{

    public static void main(String[]args){
	 VarTypes obj1= new VarTypes();
	 VarTypes obj2= new VarTypes();
	obj1.a= 1;//instance var called with obj
	obj1.b= 2;
	VarTypes.c = 3;//static var called with out obj
	VarTypes.d = 4;
	obj1.display();//obj name.method name() for  calling other class
	VarTypes.show();//class name.method name () for calling other class 
	obj2.display();
	
	}
	
}