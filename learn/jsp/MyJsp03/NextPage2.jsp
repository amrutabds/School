
<jsp:useBean id="user" class="user.UserData" scope="session"></jsp:useBean>
<HTML>
<BODY>
You entered<BR>
Name: <%= user.getUsername() %><BR> 
Husband Name: <%= user.getUserhname() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
</BODY>
</HTML>