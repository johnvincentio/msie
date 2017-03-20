<%@ taglib uri="/tags/struts-html" prefix="html" %>
<HTML>
<HEAD>
<TITLE>Sign in, Please!</TITLE>
</HEAD>
<BODY>
<html:errors/>
<html:form action="/LogonSubmit" focus="username">
<TABLE border="0" width="100%">
<TR>
<TH align="right">Username:</TH>
<TD align="left"><html:text property="username"/></TD>
</TR>
<TR>
<TH align="right">Password:</TH>
<TD align="left"><html:password property="password"/></TD>
</TR>
<TR>
<TD align="right"><html:submit/></TD>
<TD align="left"><html:reset/></TD>
</TR>
</TABLE>
</html:form>
</BODY>
</HTML>

<%--

Allow user to submit username and password to logon action.

--%>