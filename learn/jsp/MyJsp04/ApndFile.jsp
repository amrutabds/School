

<jsp:useBean id="user" class="user.UserData" scope="session"></jsp:useBean>
<%@ page import="java.io.*" %>
<jsp:include page= "Header.jsp" />
<H2><CENTER>Hi,TO VIEW THE APPENDED MSG GO TO THE BELOW FILE IN MY COMPUTERS</CENTER><BR> 
<CENTER>C:\\Personal\\School\\learn\\jsp\\MyJsp04\\MyFile.txt</CENTER><BR></H2>


<%
        try{
        
            OutputStreamWriter writer = new OutputStreamWriter(
                  new FileOutputStream("C:\\Personal\\School\\learn\\jsp\\MyJsp04\\MyFile.txt", true), "UTF-8");
            BufferedWriter fbw = new BufferedWriter(writer);
            fbw.write("append txt...");
			fbw.write(user.getFname());
            fbw.newLine();
			fbw.write(user.getEml());
			fbw.newLine();
            fbw.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

%>

<jsp:include page= "Footer.jsp" />
