
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>

<% Debug.println(">>> MainMenu"); %>

<bean:define id="jvTemplate" name="<%= jvapp.Constants.TEMPLATE_INFO_KEY %>" 
	type="jvtemplate.JVTemplate" scope="request"/>

<% Debug.println("MainMenu 1"); %>

<bean:define id="jvMenu" name="<%= jvapp.Constants.TEMPLATE_INFO_KEY %>" 
	property="menu"
	type="jvtemplate.JVMenu" scope="request"/>

<% Debug.println("MainMenu 2"); %>

<logic:iterate id="submenu" type="jvtemplate.JVSubMenu"
			name="jvMenu" property="submenus">
	<table>
		<tr>
			<th colspan=2>
				<div align="left">
					<strong><%=submenu.getName()%></strong>
				</div>
			</th>
		</tr>

		<logic:iterate id="pair" type="jvtemplate.JVPair"
				name="submenu" property="pairs">
			<tr>
				<td width="10" valign="top" ></td>
				<td valign="top"  >
					<font size="-1">
						<html:link page="<%=pair.getLink()%>"><%=pair.getText()%></html:link>
					</font>
				</td>
			</tr>
		</logic:iterate>

	</table>
	<br>

</logic:iterate>

<% Debug.println("<<< MainMenu"); %>

