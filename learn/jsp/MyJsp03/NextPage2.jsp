
<jsp:useBean id="user" class="user.UserData" scope="session"></jsp:useBean>
<HTML>
<BODY>
You entered<BR>
Name: <%= user.getUsername() %><BR> 
Husband Name: <%= user.getUserhname() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
<table><tr>
<td><H2>
<a href="Ct.html">CONTACT US  </a> 
</H2></td>

<td> <H2>
<a href="Doc.html">DOCTORS   </a> 
</H2> </td>


<td><H2>
<a href="Pt.html">PATIENTS   </a> 
</H2> </td>

<td> <H2>
<a href="We.html"> ABOUT US  </a> 
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
</table>


</BODY>
</HTML>