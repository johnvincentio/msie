
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@ page import="jvcommon.Debug" %>
<%@ page import="jvapp.JVParameters" %>
<%@ page import="jvapp.JVAttributes" %>

<html:errors/>

<bean:define id="jvBarcodes"
		name="<%= jvapp.Constants.BARCODES_INFO_KEY %>"
		type="jvcommon.JVBarcodes" scope="request"/>

<%
	Debug.println(">>> Barcodes.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("barcodes");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("barcodes");
%>

<center>

<table>
<TR>
	<TD BGCOLOR=AAAAAA><bean:message key="barcodes.hd1"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="barcodes.hd2"/></TD>
	<TD BGCOLOR=AAAAAA><bean:message key="barcodes.hd3"/></TD>
    <TD BGCOLOR=AAAAAA><bean:message key="barcodes.hd4"/></TD>
	<TD BGCOLOR=AAAAAA>&nbsp;</TD>			
</TR>

<logic:iterate id="barcode" type="jvcommon.JVBarcode"
			name="jvBarcodes" property="barcodes">
	<bean:define id="id" name="barcode" property="barcodeid"/>
	<bean:define id="id2" name="barcode" property="itemid"/>
	<tr>
		<html:form action="/BarcodeDetails.do">
		<html:hidden property="barcode" value="<%= String.valueOf(id) %>"/>
		<html:hidden property="item" value="<%= String.valueOf(id2) %>"/>
		<td><bean:write name="barcode" property="barcodeid"/></td>
		<td><bean:write name="barcode" property="name"/></td>
		<td><bean:write name="barcode" property="company"/></td>
		<td>
			<html:img src="<%=barcode.getImageurl()%>" align="left" border="0"/>
		</td>
		<td>
			<html:submit property="DETAILS">
				<bean:message key="barcodes.submit.details"/>
			</html:submit>
		</td>	
		</html:form>
	</tr>
</logic:iterate>

</table>

</center>

