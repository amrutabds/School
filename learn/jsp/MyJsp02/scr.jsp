 


<HTML>
<BODY>
<%
    //Here is a modified version of our JSP from previous section, adding in a scriptlet.
    // This is a scriptlet.  Notice that the "date" variable we declare here is available in the embedded expression later on.
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
%>
<h1> <B><I> Hello!  The time is now <%= date %> </I></B> </h1>
</BODY>
</HTML>