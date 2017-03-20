<HTML>

<HEAD>
<TITLE>Thames Books Registration</TITLE>
<STYLE>
<!--
font.jvhead {
  font-family: Arial,Helvetica,sans-serif;
  font-size:12pt; font-weight: 600; color: #000000;
}
font.jvform {
  font-family: Arial,Helvetica,sans-serif;
  font-size:10pt; font-weight: 600; color: #ffffff;
}
-->
</STYLE>
</HEAD>

<BODY>

<CENTER>
<TD VALIGN=TOP>

<FORM METHOD="POST">

<input type="hidden" name="jvaction" value="170" />

<TABLE BORDER=0 CELLSPACING=0 CELLPADDING=0 WIDTH="320"  BGCOLOR="#990022" >

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Email Address: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="email" SIZE=25 value="${jvRegister.email}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> First Name: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="firstname" SIZE=25 value="${jvRegister.firstname}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Last Name: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="lastname" SIZE=25 value="${jvRegister.lastname}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Middle Initial: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="middlename" SIZE=1 value="${jvRegister.middle}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Address 1: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="address1" SIZE=25 value="${jvRegister.faddress}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Address 2: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="address2" SIZE=25 value="${jvRegister.laddress}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> City: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="city" SIZE=25 value="${jvRegister.city}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> State: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="state" SIZE=2 value="${jvRegister.state}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Zip: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="zipcode" SIZE=5 value="${jvRegister.zip}">
</FONT> </TD>
</TR>

<TR>
<TD ALIGN=right COLSPAN="2"> <FONT CLASS="jvform"> Phone: </FONT><TD>
<TD ALIGN=left> <FONT CLASS="jvform">
	<INPUT TYPE=text NAME="phone" SIZE=11 value="${jvRegister.phone}">
</FONT> </TD>
</TR>

<TR><TD><INPUT TYPE=SUBMIT Name = "Send" Value="Register"></TD></TR>
</TABLE>

</FORM>
</CENTER>

</BODY>
</HTML>
