<%@ page import="java.util.*" %>
<HTML>
<BODY>
<%!
    Date theDate = new Date();
    Date getDate()
    {
        System.out.println( "In getDate() method" );
        return theDate;
    }
%>
Hello!  The time is now <%= getDate() %>
</BODY>
</HTML>


<!- –    The example has been created a little contrived, to show variable and method declarations.
Here we are declaring a Date variable theDate, and the method getDate.  Both of these are available now in our scriptlets and expressions.

But this example no longer works!  The date will be the same, no matter how often you reload the page.  This is because these are declarations, 
and will only be evaluated once when the page is loaded!  (Just as if you were creating a class and had variable initialization declared in it.) – -!>