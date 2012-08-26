package learn.string; 
import java.util.Scanner;

public class Strng{
	  private int month;
	  private int day;
	  private int yr;
	  public Strng(int month,int day,int yr){
  
    this.month = month;
	 this.day = day;
	 this.yr =yr;
	 System.out.printf("The constructor for this is%s\n",this);
	 
	 
	}
	public String toString(){
	return String.format("%d/%d/%d",month,day,yr);
	
	}
  
  
 }