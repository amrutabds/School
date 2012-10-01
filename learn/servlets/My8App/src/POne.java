
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class POne extends HttpServlet {
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String firstName= "tags";//request.getParameter("fname");
		String lastName="dsfff";//request.getParameter("lname");
		
		out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"fffff\">");
		String someText = "HERE ARE THE DETAIL U ENTERED ";
       
        // <FORM action="\PG2" method="GET">
		//   <input type="SUBMIT" Value="CLICK"/>
		out.println("fdsfadfdad");
		
	    out.println("</body>");
        out.println("</html>");
    }
}



