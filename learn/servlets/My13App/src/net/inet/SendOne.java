/* To demonstrate the use of Servlet Context
* Author : Team -J
* Version : 1.0
*/
package net.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class SendOne   extends HttpServlet
{ 
    public void doGet (
	HttpServletRequest	request,
	HttpServletResponse	response
    ) throws ServletException, IOException
    {
	PrintWriter		out;
    log("in servlet six service method");
// we cannot set the headers here
   //   response.setContentType("text/html");
	out = response.getWriter();
	out.println("<HTML><BODY>");
	out.println("<h1>Hi This PAGE IS REDIRED BY Send Redirect Metohd </h1>");
    }

}
