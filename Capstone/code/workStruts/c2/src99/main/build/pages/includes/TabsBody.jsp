<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%@ page import="jvapp.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<bean:define id="jvTab" name="<%= jvapp.Constants.USER_TABS %>" 
	type="jvapp.JVTabs" scope="request"/>

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
					<logic:iterate id="item" type="jvapp.JVTabsItems" 
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
<%
	Debug.println("<<< TabsBody.jsp");
%>

<%--
	<jsp:include page="/pages/includes/Footer.jsp"/>
	<%@ include file="/pages/includes/Footer.jsp"%>
<jsp:include page="<%=jvName%>"/>
<html:link page="/Tab1.do">Tab 1 Test</html:link>



this works, almost - href not working...

<table border="0"  cellspacing="0" cellpadding="0">
	<tr>
		<td width="10">&nbsp;</td>
		<td>
			<table border="0" cellspacing="0" cellpadding="5">
				<tr>
					<logic:iterate id="item" type="jvapp.JVTabsItems" 
								name="jvTab" property="items">
						<td bgcolor="<%=item.getColor()%>">
							<a href="<%=item.getHref()%>"><%=item.getTabname()%></a>
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
<%
	Debug.println("<<< TabsBody.jsp");
%>


--%>
