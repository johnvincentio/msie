<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:param name="EditActivityId"/>
<xsl:param name="EditDescription"/>
<xsl:param name="EditDuration"/>
<xsl:param name="EditPriority"/>
<xsl:param name="EditStatus"/>

<xsl:template match="/">
	<xsl:call-template name="showParams"/>
	<xsl:apply-templates />
</xsl:template>

<xsl:template match="Project">
	<xsl:element name="Project">
		<xsl:apply-templates />
		<xsl:call-template name="addActivity"/>
	</xsl:element>
</xsl:template>

<xsl:template name="addActivity">
	<xsl:element name="Activity">
		<xsl:element name="Activityid">
			<xsl:value-of select="$EditActivityId" />
		</xsl:element>
		<xsl:element name="Description">
			<xsl:value-of select="$EditDescription"/>
		</xsl:element>
		<xsl:element name="Duration">
			<xsl:value-of select="$EditDuration"/>
		</xsl:element>
		<xsl:element name="Priority">
			<xsl:value-of select="$EditPriority"/>
		</xsl:element>
		<xsl:element name="Status">
			<xsl:value-of select="$EditStatus"/>
		</xsl:element>
	</xsl:element>
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
	<xsl:if test="$EditDescription != ''">
	<xsl:message>Description: <xsl:value-of select="$EditDescription"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditDuration != ''">
	<xsl:message>Duration: <xsl:value-of select="$EditDuration"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditPriority != ''">
	<xsl:message>Priority: <xsl:value-of select="$EditPriority"/> </xsl:message>
	</xsl:if>
	<xsl:if test="$EditStatus != ''">
	<xsl:message>Status: <xsl:value-of select="$EditStatus"/> </xsl:message>
	</xsl:if>
</xsl:template>

</xsl:stylesheet>

