
<table>
	<tr>
		<th colspan=2>
			<div align="left"><strong>Options</strong></div>
		</th>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Main.do">Home</html:link>
			</font>
		</td>
	</tr>
	<logic:notPresent name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Logon.do">Logon</html:link>
			</font>
		</td>
	</tr>
	</logic:notPresent>
	<logic:present name="<%= jvapp.Constants.USER_INFO_KEY %>">
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Logoff.do">Logoff</html:link>
			</font>
		</td>
	</tr>
	</logic:present>
</table>
<br>

<table>
	<tr>
		<th colspan=2>
			<div align="left"><strong>Examples</strong></div>
		</th>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/pages/Main.jsp">Home(URL)</html:link>
			</font>
		</td>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Construction.do">Under Construction</html:link>
			</font>
		</td>
	</tr>
</table>
<br>

<table>
	<tr>
		<th colspan=2>
			<div align="left"><strong>Testing Area</strong></div>
		</th>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Tab1.do">Tab 1 Test</html:link>
			</font>
		</td>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/SessionBean1.do">Session Bean 1 Test</html:link>
			</font>
		</td>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/ConverterBeanTest.do">Converter Bean Test</html:link>
			</font>
		</td>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Tab2.do?tabno=1">Tab 2 Test</html:link>
			</font>
		</td>
	</tr>
	<tr>
		<td width="10" valign="top" ></td>
		<td valign="top"  >
			<font size="-1">
				<html:link page="/Tab2.do?tabno=2">Tab 3 Test</html:link>
			</font>
		</td>
	</tr>
</table>
<br>

<%--
<html:link page="/editRegistration.do?action=Create"><bean:message key="index.registration"/></html:link>
<html:link page="/logon.jsp"><bean:message key="index.logon"/></html:link>

<html:link page="/tour.do">
<font size="-1"><bean:message key="index.tour"/></font>
</html:link>

<bean:message key="change.message"/>
<html:link page="/logon.jsp">
  <bean:message key="change.try"/>
</html:link>

<logic:forward name="main"/>
--%>

