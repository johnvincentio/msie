<%@ taglib uri="/tags/c.tld" prefix="c" %>

<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>

<CENTER>

<H1> Please choose from the following catalogs</H1>
   

<TABLE>
<TR>
	<th BGCOLOR=AAAAAA ALIGN=CENTER>Catalog</th>
	<th BGCOLOR=AAAAAA>&nbsp;</th>	
</TR>

<c:forEach var="item" items="${jvCatalogNames.items}">

<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="210" />
	<input type="hidden" name="item" value="${item.catalogid}" />
	<TD BGCOLOR=DDDDDD>${item.ds}</TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="select" Value="Select"/>
	</TD>	
	</FORM>
</TR>

</c:forEach>

</TABLE>

<jsp:include page="ViewCart.jsp" />
<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

