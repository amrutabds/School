
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MySecEx extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		out.println("<FORM action=\"Tm\">");
		
			
        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String babyName = "Sona Sahu";
        out.println("<h1>" + " MY BABY'S NAME IS " +babyName + "</h1>");
		out.println("<input type=\"SUBMIT\" VALUE=\"CLICK\"/> ");
        out.println("</body>");
        out.println("</html>");
    }
}



