/* To demonstrate the use of Servlet Context
* Author : Team -J
* Version : 1.0
*/
package com.inet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class ServContext extends HttpServlet
{ 
    public void doGet (	HttpServletRequest	request,	HttpServletResponse	response) throws ServletException, IOException
    {
	PrintWriter		out;
	String cname,address;
    	
	ServletContext sc;
	String data="FROM Servlet Context Example \n";
	sc = getServletContext();	
	cname = sc.getInitParameter("cn");
	address = sc.getInitParameter("addr");
	
	// set content type and other response header fields first
    response.setContentType("text/html");

	// then write the data of the response
	out = response.getWriter();
	
      out.println("<HTML><HEAD><TITLE>");
	out.println(" This output is generated from a Servlet Context ");
	out.println("</TITLE></HEAD><BODY>");
	out.println(data);
	out.println("value of param cn = " +cname+"<br><br>");
	out.println("value of param addr = " +address+"<br><br>");

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
