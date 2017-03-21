<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:form action="/register">
	UserName:<html:text property="username"/><br>
	enter password:<html:password property="password1"/><br>
	re-enter password:<html:password property="password2"/><br>
	<html:submit value="Register"/>
</html:form>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Final//EN">
<HEAD>
<TITLE>Thames Books Login</TITLE>
<STYLE>
<!--
font.loginhead {
  font-family: Arial,Helvetica,sans-serif;
  font-size:12pt; font-weight: 600; color: #000000;
}
font.loginform {
  font-family: Arial,Helvetica,sans-serif;
  font-size:10pt; font-weight: 600; color: #ffffff;
}
-->
</STYLE>
</HEAD>

<jsp:useBean id="jvMsg" type="jvbean.JVMessage" scope="request"/>

<BODY>

<CENTER>
<FONT CLASS="loginhead"> 
	<jsp:getProperty name="jvMsg" property="text" />
</FONT>
<BR>
<BR>

<FORM NAME="loginform" METHOD=post>
<input type="hidden" name="jvaction" value="100" />

<TABLE BGCOLOR=#990022 BORDER=0 CELLPADDING=5 CELLSPACING=0>
<TR>
<TD ALIGN=right>
	<FONT CLASS="loginform"> Email Id: </FONT>
</TD>
<TD ALIGN=left>
	<FONT CLASS="loginform"> <INPUT TYPE=text NAME="name" SIZE=30>
	</FONT>
</TD>
</TR>

<TR>
<TD ALIGN=right>
	<FONT CLASS="loginform"> Password: </FONT>
</TD>
<TD ALIGN=left>
	<FONT CLASS="loginform"><INPUT TYPE=password NAME="password" SIZE=30>
	</FONT>
</TD>
</TR>

<TR>
	<TD COLSPAN=2 ALIGN=center>
	<FONT CLASS="loginform">
	<INPUT TYPE=SUBMIT VALUE="Login">
	</FONT>
	</TD>
</TR>
</TABLE>

<BR>
<FONT CLASS="loginhead"> Lost Password? Enter your email, check this box and Login</FONT>
	<input type="checkbox" name="lostpassword" />
</FORM>

<BR>
<FORM METHOD=post>
	<input type="hidden" name="jvaction" value="110" />
	<FONT CLASS="loginhead"> New User? Register here: </FONT>
	<INPUT TYPE="submit" Name="register" Value="Register">
</FORM>

</CENTER>

</BODY>
</HTML>
