<HEAD>
<TITLE>Error Page</TITLE>
</HEAD>

<BODY>

<jsp:useBean id="jvMsg" type="jvbean.JVMessage" scope="request"/>

<center>
<b>Error occured</b>
<br>
<b> <jsp:getProperty name="jvMsg" property="header" /> </b> <br>
<b> <jsp:getProperty name="jvMsg" property="text" /> </b> <br>
</center>


</BODY>
</HTML>
