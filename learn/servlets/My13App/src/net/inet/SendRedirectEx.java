/* To demonstrate the use of Servlet Redirect
* Author : Team -J
* Version : 1.0
*/
package net.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class SendRedirectEx extends HttpServlet
{ 
    public void doGet (	HttpServletRequest	request,
	HttpServletResponse	res
    ) throws ServletException, IOException
    {
	 res.setContentType( "text/html" );
    PrintWriter pw = res.getWriter();

    pw.println( "going to do a redirect" );

    // content before the redirect is ignored

    // redirect to the web site
    res.sendRedirect( "http://www.sun.com" );

    // do not output anything after a redirect
    // it will not cause an error, but the sendRedirect()
    // outputs content to the response body that provides
    // enables those client that do not get automatically
    // redirected with a link to get them there!
	
    }
}
