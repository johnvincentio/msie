
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<html:errors/>

<h2><bean:message key="characteristics.title"/></h2>

<bean:define id="jvCharacteristics"
		name="<%= jvapp.Constants.CHARACTERISTICS_INFO_KEY %>"
		type="jvcommon.JVCharacteristics" scope="request"/>

<%
	Debug.println(">>> Characteristics.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("Characteristics");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("Characteristics");
%>

<center>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="characteristics.hd1"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="characteristics.hd2"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="characteristics.hd3"/></TD>
</TR>
<tr>
	<td><bean:write name="jvCharacteristics" property="itemid"/></td>
	<td><bean:write name="jvCharacteristics" property="name"/></td>
	<td><bean:write name="jvCharacteristics" property="description"/></td>
</tr>
</table>

<br/>

<table>
<TR>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="characteristics.hd4"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="characteristics.hd5"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="characteristics.hd6"/></TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
</TR>

<logic:iterate id="characteristic" type="jvcommon.JVCharacteristic"
			name="jvCharacteristics" property="characteristics">
	<tr>
		<td><bean:write name="characteristic" property="catname"/></td>
		<td><bean:write name="characteristic" property="optname"/></td>
		<td><bean:write name="characteristic" property="optvalue"/></td>
	</tr>
</logic:iterate>

</table>

</center>

