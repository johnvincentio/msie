
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvdebug.Debug" %>

<% Debug.println(">>> MainBody"); %>

<bean:define id="jvBody" name="<%= jvapp.Constants.TEMPLATE_INFO_KEY %>" 
	property="body"
	type="jvtemplate.JVBody" scope="request"/>

<% Debug.println("MainBody 2"); %>

<table>
	<tr>
		<logic:iterate id="subbody" type="jvtemplate.JVSubBody"
					name="jvBody" property="subbodies">
			<% Debug.println("MainBody 3"); %>
			<td valign="top">
				<logic:iterate id="column" type="jvtemplate.JVColumn"
							name="subbody" property="columns">
					<jsp:include page="<%=column.getFile()%>"/>
					<br/>
				</logic:iterate>
			</td>
		</logic:iterate>
	</tr>
</table>

<% Debug.println("<<< MainBody"); %>

