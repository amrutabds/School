
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class POne extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String someText = "THIS IS MY HOME PAGE";
        out.println("<h1>" + someText + "</h1>");
		out.println("<FORM action=\"\\PG2\" method=\"GET\">");
        // <FORM action="\PG2" method="GET">
		//   <input type="SUBMIT" Value="CLICK"/>
		out.println("<input type=\"SUBMIT\" VALUE=\"CLICK\"/> ");
		out.println("</FORM>");
	    out.println("</body>");
        out.println("</html>");
    }
}



