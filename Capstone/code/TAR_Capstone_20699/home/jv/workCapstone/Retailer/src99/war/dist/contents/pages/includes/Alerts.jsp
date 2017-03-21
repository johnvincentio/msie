
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<html:errors/>

<bean:define id="jvAlerts" name="<%= jvapp.Constants.ALERTS_INFO_KEY %>"
		type="jvcommon.JVAlerts" scope="request"/>

<%
	Debug.println(">>> Alerts.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("alerts");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("alerts");
%>

<center>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="alerts.hd1"/></TD>
    <TD BGCOLOR=AAAAAA><bean:message key="alerts.hd2"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="alerts.hd3"/></TD>			
	<TD BGCOLOR=AAAAAA><bean:message key="alerts.hd4"/></TD>			
	<TD BGCOLOR=AAAAAA><bean:message key="alerts.hd5"/></TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="alerts.hd6"/></TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
</TR>

<logic:iterate id="alert" type="jvcommon.JVAlert"
			name="jvAlerts" property="alerts">
	<bean:define id="id" name="alert" property="alertid"/>
	<tr>
		<html:form action="/AppMain.do?selected=0">
		<html:hidden property="alert" value="<%= String.valueOf(id) %>" />

		<td><bean:write name="alert" property="alertid"/></td>
		<td><bean:write name="alert" property="eventid"/></td>
		<td><bean:write name="alert" property="roleid"/></td>
		<td><bean:write name="alert" property="alertlevel"/></td>
		<td><bean:write name="alert" property="alertnumber"/></td>
		<td><bean:write name="alert" property="description" filter="false"/></td>
		<td>
			<html:submit property="DETAILS">
				<bean:message key="alerts.submit.details"/>
			</html:submit>
			<html:submit property="REMOVE">
				<bean:message key="alerts.submit.remove"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</logic:iterate>

</table>

</center>

