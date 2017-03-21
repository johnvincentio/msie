
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<html:errors/>

<bean:define id="jvCollections"
		name="<%= jvapp.Constants.COLLECTIONS_INFO_KEY %>"
		type="jvcommon.JVCollections" scope="request"/>

<%
	Debug.println(">>> Collections.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("collections");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("collections");
%>

<center>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="products.hd1"/></TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER><bean:message key="products.hd2"/></TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
</TR>

<logic:iterate id="collection" type="jvcommon.JVCollection"
			name="jvCollections" property="collections">
	<bean:define id="id" name="collection" property="collectionid"/>
	<tr>
		<html:form action="/Barcodes.do">
		<html:hidden property="collection" value="<%= String.valueOf(id) %>"/>

		<td><bean:write name="collection" property="collectionid"/></td>
		<td><bean:write name="collection" property="description" filter="false"/></td>
		<td>
			<html:submit property="SEND">
				<bean:message key="products.submit.send"/>
			</html:submit>
			<html:submit property="DETAILS">
				<bean:message key="products.submit.details"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</logic:iterate>

</table>

</center>

