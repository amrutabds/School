/* To demonstrate the use of Servlet Config Paramaters 
* Author : Team -J
* Version : 1.0
*/
package com.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class ServConfig extends HttpServlet
{ 
    public void doGet (	HttpServletRequest	request,	HttpServletResponse	response) throws ServletException, IOException
    {
	PrintWriter		out;
	
    	
	String firstParam = getInitParameter("firstParam");
	String secParam = getInitParameter("secParam");
	String data="FROM Servlet Config Example \n";
	
	
	// set content type and other response header fields first
    response.setContentType("text/html");

	// then write the data of the response
	out = response.getWriter();
	
      out.println("<HTML><HEAD><TITLE>");
	out.println(" This output is generated from a Servlet Config ");
	out.println("</TITLE></HEAD><BODY>");
	out.println(data);
	out.println("value of param firstParam = " +firstParam+"<br><br>");
	out.println("value of param secParam = " +secParam+"<br><br>");

	out.println("</BODY></HTML>");
	out.close();
    }
public void init(){
	try{
		System.out.println("Now Executing the init Method of the ServContext");
		ServletContext sc = getServletContext();	
	}catch(Exception e){}
}

}
