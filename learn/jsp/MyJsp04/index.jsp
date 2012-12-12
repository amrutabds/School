<!Hospital.html>
<html>
<HEAD> <TITLE> NRK HOSPITAL</TITLE>   </HEAD>

<jsp:include page= "Header.jsp" />

<body style="background-color:YELLOW;">
<H2> <CENTER>WELCOME TO NRK HOSPITAL

</CENTER></H2>

<h4>
Complete and Submit</h4>

<FORM  action="NextPage2.jsp"  method="post">
Name      : <input type="text" name="fname"/> <br/>
Email id  : <input type="text" name="eml"/> <br/>
Password  : <input type="text" name="pwd"/> <br/>
<input type="submit" value="Submit" />
</FORM>


<jsp:include page= "Footer.jsp" />
</body>
</html>

