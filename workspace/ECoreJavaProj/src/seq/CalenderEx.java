 package learn.coreJava.seq;
 import java.util.Date;
 import java.util.Calendar ;
 import java.text.SimpleDateFormat;
 import java.util.* ;

    public class Calender{

    public static void main(String[]args){
 
	//Calendar calObj= new Calendar(); shd  not call in this way as CALENDAR  IS A ABSTRACT CLASS AND U CANNOT CREAT AN OBJECT FOR IT
	//Calendar calNewObj= new Calendar();shd  not call in this way as CALENDAR  IS A ABSTRACT CLASS AND U CANNOT CREAT AN OBJECT FOR IT
    
	Calendar calObj=Calendar.getInstance();
	Calendar calNewObj=Calendar.getInstance();
	
	
	SimpleDateFormat dateformatter = new SimpleDateFormat("E yyyy.MMM.dd 'at' hh:mm:ss a zzz");
	System.out.println("Current date and time in simple date format: "+ dateformatter.format(calObj.getTime()));
	
	boolean checkFlag=true;    
	
	calNewObj.set(2010,00,01);
	while(checkFlag){
	    
		calNewObj.add(Calendar.DAY_OF_MONTH,365);
		//calNewObj..clone();
		System.out.println("Older date and time in simple date format: "+ dateformatter.format(calNewObj.getTime()));
		if(calObj.after(calNewObj))
			{	
				System.out.println("<h5>DATE THAT COMES NEXT YEAR  </h5><br>");
			}else{
			checkFlag=false;
			System.out.println("<h5>CAN NOT GO TO FUTURE DATE</h5><br>");
			}
	}

	
	
   }
   
   }
