<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:param name="EditActivityId"/>

<xsl:template match="/">
	<xsl:call-template name="showParams"/>
	<xsl:apply-templates />
</xsl:template>

<xsl:template match="Activity">
	<xsl:message>Current Act: <xsl:value-of select="Activityid"/> </xsl:message>
	<xsl:choose>
		<xsl:when test="Activityid = $EditActivityId">
			<xsl:message>ignoring</xsl:message>
		</xsl:when>
		<xsl:otherwise>
			<xsl:copy>
				<xsl:apply-templates select="*|@*|comment()|processing-instruction()|text()"/>
			</xsl:copy>
		</xsl:otherwise>
	</xsl:choose>

</xsl:template>

<xsl:template match="*|@*|comment()|processing-instruction()|text()">
	<xsl:copy>
		<xsl:apply-templates select="*|@*|comment()|processing-instruction()|text()"/>
	</xsl:copy>
</xsl:template>

<xsl:template name="showParams">
	<xsl:if test="$EditActivityId != ''">
	<xsl:message>Activity: <xsl:value-of select="$EditActivityId"/> </xsl:message>
	</xsl:if>
</xsl:template>

</xsl:stylesheet>

