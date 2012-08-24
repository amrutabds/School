
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageTwo extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String firstName=request.getParameter("fName");
        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String someText = "THIS IS MY SECOND PAGE" ;
        out.println("<h1>"+firstName+"</h1>");	
	    out.println("</body>");
        out.println("</html>");
    }
}



