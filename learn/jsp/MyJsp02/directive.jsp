<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.*" %>
<%
	Calendar calObj = Calendar.getInstance();
	SimpleDateFormat dateformatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	out.println("<h1>Current date and time in simple date format: "+ dateformatter.format(calObj.getTime())+"</h1><br>");
%>


