<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- 
Example on how to include java code directly into jsp page.
(Scriptlets)
-->

<%@ page info=" This directive is used to give information about the page" %>
<%@ page language="java"%>

<HTML>
<HEAD>
<TITLE>First Jsp Example</TITLE>
</HEAD>

<BODY>
<H2>Hello World for five times</H2>
<!-- we can include the declaration of vailables that can be used
in a page as shown below we can write methods that can be called
from this page in declarative section
-->
<%!
	int count =0;
%>
   <% for (count=0;count <10;count++) {%>
	Date :: <%=new java.util.Date()%> 
	<br> some html stuff can go here <br><br>
    <% }%>	
<br><br> Date is generated by using an expression in jsp file <br><br>
	This file is generated by INteSolv Students. <br><br><br>
Thanks for visiting us !!!! <br><br>

<%@ include file="copyright.html" %> 

</BODY>
</HTML>