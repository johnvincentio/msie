
<%--
<%@ page import="java.util.*" %>

<HR>
<H1> Parameters </H1>
<TABLE>
<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Parameter Name</TD>
    <TD BGCOLOR=AAAAAA>Parameter Value</TD>
</TR>

<% Enumeration itr = request.getParameterNames();
	while (itr.hasMoreElements()) {
		String pName = (String) itr.nextElement();
		String pValue = request.getParameter(pName); %>
		<TR><TD BGCOLOR=DDDDDD><%=pName%></TD>
		<TD BGCOLOR=DDDDDD><%=pValue%></TD>
		</TR>
<% } %>		
</TABLE>
<HR>
--%>


