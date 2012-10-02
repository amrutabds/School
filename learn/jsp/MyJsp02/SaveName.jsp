<%
   String name = request.getParameter("username");
   session.setAttribute( "theName", name );
   String age = request.getParameter("age");
   session.setAttribute( "theAge", age );
   String email = request.getParameter("email");
   session.setAttribute( "theEmail", email );
%>
<HTML>
<BODY>
<A HREF="NextPage.jsp">Continue</A>
</BODY>
</HTML>