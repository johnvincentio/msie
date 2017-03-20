<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/c.tld" prefix="c" %>

<HTML>
<HEAD><TITLE>Thames Books</TITLE></HEAD>
<BODY>

<CENTER>

<H1> Checkout</H1>

<TABLE>
<TR>
	<TD BGCOLOR=AAAAAA>Stock ID</TD>
	<TD BGCOLOR=AAAAAA ALIGN=CENTER>Catalog</TD>
    <TD BGCOLOR=AAAAAA>Description</TD>
	<TD BGCOLOR=AAAAAA>Items</TD>			
    <TD BGCOLOR=AAAAAA ALIGN=CENTER>Price</TD>
    <TD BGCOLOR=AAAAAA ALIGN=CENTER>Total</TD>	
	<TD BGCOLOR=AAAAAA>Remove</TD>
	<TD BGCOLOR=AAAAAA>Update</TD>
</TR>
<c:forEach var="item" items="${jvShoppingCart.items}">
	<TR>
	<FORM METHOD="POST">
	<input type="hidden" name="jvaction" value="320" />
	<input type="hidden" name="item" value="${item.cartid}" />
	<TD BGCOLOR=DDDDDD>${item.itemid}</TD>	
	<TD BGCOLOR=DDDDDD>${item.catalog}</TD>
	<TD BGCOLOR=DDDDDD>${item.sds}</TD>
	<TD BGCOLOR=DDDDDD>${item.quantity}</TD>			 	 
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${item.price}</TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${item.total}</TD>
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="remove" Value="Remove"/>
	</TD>	
	<TD BGCOLOR=DDDDDD>
		<INPUT TYPE="submit" Name="update" Value="Update"/>
	</TD>	
	</FORM>
</c:forEach>
<TR>
	<TD>&nbsp;</TD>
	<TD>&nbsp;</TD>
	<TD>&nbsp;</TD>
	<TD>&nbsp;</TD>
	<TD BGCOLOR="DDDDDD">Total</TD>
	<TD BGCOLOR=DDDDDD ALIGN=RIGHT>${jvShoppingCart.computeTotal}</TD>
</TR>
</TABLE>

<hr>

<H1 ALIGN="CENTER">Checking Out</H1>
We are sorry, but our electronic credit-card-processing
system is currently out of order. Please send a check
to:
<PRE>
  Marty Hall
  coreservlets.com, Inc.
  6 Meadowsweet Ct., Suite B1
  Reisterstown, MD 21136-6020
  410-429-5535
  hall@coreservlets.com
</PRE>
Since we have not yet calculated shipping charges, please
sign the check but do not fill in the amount. We will
generously do that for you.

<jsp:include page="ViewLogout.jsp" />

<jsp:include page="Parameters.jsp" />

</CENTER>

</BODY>
</HTML>

