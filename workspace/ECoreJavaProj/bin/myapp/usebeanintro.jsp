<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- 
Example on how to use java beans to write business logic
-->

<%@ page info=" This directive is used to give information about the page" %>
<%@ page language="java"%>
<%@ page errorPage="errpage.jsp"%>
<%@ page import="ourpack.*"%>
<HTML>
<HEAD>
<TITLE>UseBean Example</TITLE>
</HEAD>

<BODY>
<H2>shows how to use java bean from jsp</H2>
<!-- Check the output servlet generated by the jsp engine to see what happens 
under the hood.
shows how servlet code tries to set the property by using intorspection
-->

<jsp:useBean id="beanvar" scope="session" class="ourpack.ourbean" />

<!-- shows how to set the property of the bean -->
<jsp:setProperty  name="beanvar"   property="Prop1"    value="444" />
    
<!-- shows how to get the property of the bean -->
<br> output of get propert tag 
<jsp:getProperty name="beanvar" property="Prop1" />
<br>
   <% 
	out.println(" out put of method on bean ="+ beanvar.someMethod(22));
    %>	
	<br>This file is generated by INteSolv Students. <br><br><br>
Thanks for visiting us !!!! <br><br>

<%@ include file="copyright.html" %> 

</BODY>
</HTML>