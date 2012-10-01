<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.*" %>
<%
	Calendar calObj = Calendar.getInstance();
	Calendar calNewObj = Calendar.getInstance();

	SimpleDateFormat dateformatter = new SimpleDateFormat("E yyyy.MMM.dd 'at' hh:mm:ss a zzz");
	out.println("<h1>Current date and time in simple date format: "+ dateformatter.format(calObj.getTime())+"</h1><br>");
	boolean checkFlag=true;
	
	calNewObj.set(2000,00,01);
	while(checkFlag){
	    
		calNewObj.add(Calendar.DAY_OF_MONTH,365);
		//calNewObj..clone();
		out.println("<h3>Current date and time in simple date format: "+ dateformatter.format(calNewObj.getTime())+"</h3><br>");
		if(calObj.after(calNewObj))
			{	
				out.println("<h3>AFTER AFTER AFTER </h3><br>");
			}else{
			checkFlag=false;
			out.println("<h3>CAN NOT GO TO FUTURE DATE  </h3><br>");
			}
	}

	
	
%>


