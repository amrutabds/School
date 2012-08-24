
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageOne extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String firstName= request.getParameter("fName");
		String lname= request.getParameter("lName");
		String email= request.getParameter("email");
		String sex= request.getParameter("sex");
        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String someText = "HERE ARE THE DETAIL U ENTERED ";
       
        // <FORM action="\PG2" method="GET">
		//   <input type="SUBMIT" Value="CLICK"/>
		out.println("<FORM action=\"PG2\">");
		out.println("<h1><U><B>" + someText + "</B></U></h1>");
		out.println("<h4> FIRST NAME:" + firstName + "</h1>");
		out.println("<h4> LAST NAME :" + lname + "</h1>");
		out.println("<h4> EMAIL     :" + email + "</h1>");
		out.println("<h4> SEX       :" + sex + "</h1>");
		out.println("<input type=\"hidden\" name=\"fName\" value="+firstName+"/>");
		out.println("<input type=\"SUBMIT\" VALUE=\"CLICK\"/> ");
		out.println("</FORM>");
	    out.println("</body>");
        out.println("</html>");
    }
}



