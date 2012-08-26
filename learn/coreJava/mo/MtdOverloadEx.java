package learn.mo;
import java.util.Scanner;
class MtdOverloadEx{
public int a,b,c,ans;
	public void takeInput(){
    Scanner ams=new Scanner(System.in);
	System.out.println("Enter a value");
	a=ams.nextInt();
    System.out.println("Enter b value");
	b=ams.nextInt();
	System.out.println("Enter c value");
	c=ams.nextInt();	
	}
	public int add(int x,int y){
	ans=x+y;
	return ans;
	}
	public int add(int x,int y,int z){
	ans= x+y+z;
	return ans;
	}
	public void sub(){
	ans=a-b;
	System.out.println("Result of a-b is  : "+ ans);
	}
}
class MOExMain{
	public static void main(String[]args){
	MOEx obj= new MOEx();
	int ans;//It is required to assign {int ans}here again to return ans. .
	obj.takeInput();
	ans=obj.add(obj.a,obj.b);
	System.out.println("Result of a+b is  : "+ans);
    ans=obj.add(obj.a,obj.b,obj.c);
	System.out.println("Result of a+b+c is: "+ans);
	obj.sub();
	}
}