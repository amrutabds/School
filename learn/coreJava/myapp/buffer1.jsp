<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- 
Example on how buffer and auto flush can be used
(Scriptlets)
-->

<%@ page info=" This directive is used to give information about the page" %>
<%@ page language="java"%>
<%@ page buffer="1k"%>
<%@ page autoFlush="true"%>
<HTML>
<HEAD>
<TITLE>First Jsp Example</TITLE>
</HEAD>

<BODY>
<H2>Buffer and autoflush Directives</H2>
<!-- we keep on generating lot's of stuff to show the importance of buffer
and autoflush
-->
<%!
	int count =0;
%>
   <% for (count=0;count <100;count++) {%>
	Date :: <%=new java.util.Date()%> 
	<br> some html stuff can go here <br><br>
    <% }%>	
<br><br> Date is generated by using an expression in jsp file <br><br>
	This file is generated by INteSolv Students. <br><br><br>
Thanks for visiting us !!!! <br><br>

<%@ include file="copyright.html" %> 

</BODY>
</HTML>