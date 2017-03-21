<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:attribute-set name="table-style">
	<xsl:attribute name="align">center</xsl:attribute>
	<xsl:attribute name="width">75%</xsl:attribute>
	<xsl:attribute name="cellpadding">10</xsl:attribute>
	<xsl:attribute name="border">2</xsl:attribute>
</xsl:attribute-set>

<xsl:variable name="font1">font-family:Verdana; font-weight: bold;</xsl:variable>

<xsl:attribute-set name="activity-row-style">
	<xsl:attribute name="bgcolor">#bbbccc</xsl:attribute>
	<xsl:attribute name="style"><xsl:value-of select="$font1"/> </xsl:attribute>
</xsl:attribute-set>

<xsl:variable name="title">Project</xsl:variable>
<xsl:variable name="header">Thames Aircraft Space Division</xsl:variable>

<xsl:template name="makeTitle">
	<head><title><xsl:value-of select="$title"/></title></head>
</xsl:template>

<xsl:template name="makeHeader">
	<a name="TOP"/>
	<h1 align="center"><xsl:value-of select="$header"/></h1>
</xsl:template>

<xsl:template name="gotoTop">
	<br/><a href="#TOP">Top</a>
</xsl:template>

<xsl:template name="makeAddHeader">
	<h1 align="center">Add Activity</h1>
</xsl:template>

<xsl:template name="makeQueryHeader">
	<h1 align="center">Query Activities</h1>
</xsl:template>

<!-- following stuff seemed like a good idea at the time -->

<xsl:template name="InputSubmitType">
	<xsl:param name="name"/>
	<xsl:param name="value"/>
	<input>
		<xsl:attribute name="type">submit</xsl:attribute>
		<xsl:attribute name="name">
			<xsl:value-of select="$name" />
		</xsl:attribute>
		<xsl:attribute name="value">
			<xsl:value-of select="$value" />
		</xsl:attribute>
	</input>
</xsl:template>

<xsl:template name="InputTextType">
	<xsl:param name="name"/>
	<xsl:param name="size"/>
	<xsl:element name="input">
		<xsl:attribute name="type">text</xsl:attribute>
		<xsl:attribute name="name">
			<xsl:value-of select="$name" />
		</xsl:attribute>
		<xsl:attribute name="value"></xsl:attribute>
		<xsl:attribute name="size">
			<xsl:value-of select="$size" />
		</xsl:attribute>
	</xsl:element>
</xsl:template>

<xsl:template name="Debug">		<!-- gave up; too much trouble to use -->
	<xsl:param name="name"/>
	<xsl:param name="value"/>
	<br/>
	<xsl:value-of select="$name"/>
	<xsl:text> = </xsl:text>
	<xsl:value-of select="$value"/>
</xsl:template>

</xsl:stylesheet>

