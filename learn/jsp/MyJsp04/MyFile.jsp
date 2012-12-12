

<jsp:useBean id="user" class="user.UserData" scope="session"></jsp:useBean>
<%@ page import="java.io.*" %>

<jsp:include page= "Header.jsp" />
<H2><CENTER>Hi,TO VIEW THE MSG,</center></br></H2>
<H3><center>GO TO THE BELOW FILE IN MY COMPUTERS</CENTER><BR> 
<CENTER>C:\\Personal\\School\\learn\\jsp\\MyJsp04\\MyFile.txt</CENTER><BR></H3>

<%
try {
String real_filename = "C:\\Personal\\School\\learn\\jsp\\MyJsp04\\MyFile.txt";
FileOutputStream fos = new FileOutputStream(real_filename);
PrintWriter pw = new PrintWriter(fos);
System.out.println("Fname:"+user.getFname());
System.out.println("Eml  :"+user.getEml());
pw.println(user.getFname());
pw.println(user.getEml());
pw.close();
fos.close();
}
catch (Exception e) {
// Handle exceptions
}
%>



<jsp:include page= "Footer.jsp" />