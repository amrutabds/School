<- -The method names must be exactly as shown.  Once you have defined the class, compile it and make sure it is available in the web-server's
 classpath.  The server may also define special folders where you can place bean classes, e.g. with Blazix you can place them in the "classes"
 folder.  If you have to change the classpath, the web-server would need to be stopped and restarted if it is already running.  
 Note that we are using the package name "learn.jsp.Myjsp02", therefore the file UserData.class must be placed in a folder named 
"learn.jsp.Myjsp02"under the classpath entry.Now let us change "SaveName.jsp" to use a bean to collect the data- ->



<jsp:useBean id="user" class="user.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<HTML>
<BODY>
<A HREF="NextPage2.jsp">Continue</A>
</BODY>
</HTML>