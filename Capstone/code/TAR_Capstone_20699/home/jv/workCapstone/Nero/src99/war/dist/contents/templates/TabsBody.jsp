
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvdebug.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<bean:define id="jvTab" name="<%= jvapp.Constants.USER_TABS %>" 
	type="jvtemplate.JVTabs" scope="request"/>

<%
	Debug.println(">>> TabsBody.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("tabsLayout");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("tabsLayout");
%>

<table border="0"  cellspacing="0" cellpadding="0">
	<tr>
		<td width="10">&nbsp;</td>
		<td>
			<table border="0" cellspacing="0" cellpadding="5">
				<tr>
					<logic:iterate id="item" type="jvtemplate.JVTabsItems" 
								name="jvTab" property="items">
						<td bgcolor="<%=item.getColor()%>">
							<html:link 
								page="<%=item.getHref()%>"><%=item.getTabname()%>
							</html:link>
						</td>
						<td width="1" ></td>
					</logic:iterate>
				</tr>
			</table>
		</td>
		<td width="10" >&nbsp;</td>
	</tr>

	<tr>
		<td height="5" bgcolor="<%=jvTab.getSelectedColor()%>" colspan="3" >&nbsp;</td>
	</tr>  

	<tr>
		<td width="10" bgcolor="<%=jvTab.getSelectedColor()%>">&nbsp;</td>
		<td>
			<jsp:include page="<%=jvTab.getSelectedBody()%>"/>
		</td>
		<td width="10" bgcolor="<%=jvTab.getSelectedColor()%>">&nbsp;</td>
	</tr>  

	<tr>
		<td height="5" bgcolor="<%=jvTab.getSelectedColor()%>" colspan="3" >&nbsp;</td>
	</tr>  

</table>

<% Debug.println("<<< TabsBody.jsp"); %>

