
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Time extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		Date d = new Date();
		
		System.out.println(" Todays Date is : "+d);		
        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		
		out.println("<h7>" + " TODAYS DATE IS " +d + "</h7>");
        
		
		out.println("<h7>" + " AFTER 10 DAYS DATE IS " +x + "</h7>");
		
		
		
		out.println("</body>");
        out.println("</html>");
    }
}



