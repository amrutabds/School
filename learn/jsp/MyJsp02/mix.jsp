<%
System.out.println("Entered Value is :"+request.getParameter("userChoice"));
String userInput= request.getParameter("userChoice");
boolean userInputBooleanValue = Boolean.parseBoolean(userInput);

if(userInputBooleanValue){
%> <h1>Hello World</h1>
<%
}else{
%>
<h1>Good Bye World</h1>
<%}%>



