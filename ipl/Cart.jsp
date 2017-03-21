<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- Bring a Cart bean into play in session scope --%>
<jsp:useBean id="info" class="jsp.Cart" scope="session"/>
<%-- Read the HTTP request parameter called "item" --%>
<jsp:setProperty name="info" property="item"/>
<%-- The remainder of the JSP is identical to the HTML file... --%>

<html>

<head>
<title>Shopping Cart</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body bgcolor="white">
<%-- ...except that in the middle here we read a bean property to 
display the cart contents --%>
<p>Here is your cart:
<jsp:getProperty name="info" property="items"/>
<hr>
Add item.<p>
<form method="GET" action="Cart.jsp">
  <input type="text" name="item"><p>
  <input type="submit">
</form>
</body>
</html>

