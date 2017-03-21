<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>

<xsl:template match="/">
	<html>
		<head> <title>Home</title> </head>
		<body>
			<table>
				<xsl:apply-templates />
			</table>
		</body>
	</html>
</xsl:template>

<xsl:template match="cities">
	<xsl:apply-templates />
</xsl:template>

<xsl:template match="city">
	<tr>
		<td><xsl:value-of select="name" /></td>
		<td><xsl:value-of select="population" /></td>
	</tr>
</xsl:template>

</xsl:stylesheet>
