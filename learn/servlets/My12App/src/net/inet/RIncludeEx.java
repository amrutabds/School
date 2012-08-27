/* To demonstrate the use of Servlet Context
* Author : Team -J
* Version : 1.0
*/
package net.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class RIncludeEx extends HttpServlet
{ 
    public void doGet (
	HttpServletRequest	request,
	HttpServletResponse	response
    ) throws ServletException, IOException
    {
	PrintWriter		out;
	ServletContext sc;
	sc = getServletContext();
      response.setContentType("text/html");
	out = response.getWriter();
	RequestDispatcher rd = sc.getRequestDispatcher("/rione");
	System.out.println("before including request");
	// we can use forward to forward request to another servlet.
	rd.include(request,response);
	System.out.println("after forwarding request");
	out.println("<h3 style="color:blue"> Hi This is from R INCLUDE </h3>");
	out.println("</BODY></HTML>");
	out.close();
    }
}
