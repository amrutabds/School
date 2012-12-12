
<jsp:useBean id="user" class="user.UserData" scope="session"></jsp:useBean>
<jsp:setProperty name="user" property="*"/> 
<HTML>
<BODY>
<jsp:include page= "Header.jsp" />
<H2><CENTER>Hello <%= user.getFname() %></CENTER><BR> 
<CENTER>your Email: <%= user.getEml() %></CENTER><BR></H2>

<table><tr>
<td><H2>
<a href="index.html">CONTACT US  </a> 
</H2></td>

<td> <H2>
<a href="index.html">DOCTORS   </a> 
</H2> </td>


<td><H2>
<a href="index.html">PATIENTS   </a> 
</H2> </td>

<td> <H2>
<a href="index.html"> ABOUT US  </a> 
</H2> </td>

</tr></table>
<table>
<tr>
<td>
<p>  
<CENTER> <b>NRK HEALTH CENTER</b></CENTER>
</P>
</td>
</tr>
<tr>
<td style="background-color:red;">
<p>  
<CENTER>
The IWK Health Centre provides quality care to women, children, youth and families in the Maritime provinces and beyond. In addition to providing highly specialized (tertiary) care, the IWK also provides primary care services. The IWK is engaged in leading-edge research; works to promote healthy lifestyles for families; and supports education opportunities for health professionals and other learners.
 
<center><b>Our Mission</b></CENTER>
To make a difference in the health and well being of women, children, youth and families
To bring together care, research, teaching and advocacy for the best possible results
To be global leaders in research and knowledge sharing

<CENTER><b>Our Vision</b></CENTER>

<Center>Healthy families. The best care.</Center></P>
</td>

</tr>
<tr>
<td>
<a href="MyFile.jsp"> CLICK  </a></BR>
<a href="ApndFile.jsp"> Apnd 2File CLICK  </a>
</table>

<jsp:include page= "Footer.jsp" />
</BODY>
</HTML>