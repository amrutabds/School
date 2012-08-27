/* To demonstrate the use of Servlet Context
* Author : Team -J
* Version : 1.0
*/
package net.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class RForwardEx extends HttpServlet
{ 
    public void doGet (
	HttpServletRequest	request,
	HttpServletResponse	response
    ) throws ServletException, IOException
    {
		System.out.println("1111111111before forwarding request");
	PrintWriter		out;
			System.out.println("22222222 forwarding request");

	ServletContext sc;
	sc = getServletContext();
      response.setContentType("text/html");
	out = response.getWriter();
	RequestDispatcher rd = sc.getRequestDispatcher("/rfone");
	System.out.println("before forwarding request");
	// we can use forward to forward request to another servlet.
	rd.forward(request,response);
	System.out.println("after forwarding request");
	out.println(" Hi This is from SSEVEN 777");
	out.println("</BODY></HTML>");
	out.close();
    }
}
