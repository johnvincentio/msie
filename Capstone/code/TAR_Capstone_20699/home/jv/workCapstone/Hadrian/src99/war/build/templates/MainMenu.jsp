
<%@ page import="java.util.*" %>
<%@ page import="jvdebug.Debug" %>
<%@ page import="jvtemplate.JVSubMenu" %>
<%@ page import="jvtemplate.JVPair" %>

<% Debug.println(">>> MainMenu"); %>

<jsp:useBean id="jvTemplates" class="jvtemplate.JVTemplate" scope="request"/>

<%
	Debug.println("MainMenu 1");
	Iterator submenus = jvTemplates.getMenu().getSubmenus();
	while(submenus.hasNext()){
		JVSubMenu submenu = (JVSubMenu)submenus.next();
		Debug.println("MainMenu 2");
		Debug.println("menu name :"+submenu.getName()+":");
%>
	<table>
		<tr>
			<th colspan=2>
				<div align="left">
					<strong><%=submenu.getName()%></strong>
				</div>
			</th>
		</tr>
<%
		Iterator pairs = submenu.getPairs();
		while(pairs.hasNext()){
			JVPair pair = (JVPair) pairs.next();
			Debug.println("MainMenu 3");
%>
			<tr>
				<td width="10" valign="top" ></td>
				<td valign="top"  >
					<font size="-1">
						<a href="<%=pair.getLink()%>"><%=pair.getText()%></a>
					</font>
				</td>
			</tr>
<%
		}
%>
	</table>
	<br>

<%
	}
	Debug.println("<<< MainMenu");
%>

