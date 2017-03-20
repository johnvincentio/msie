<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" indent="yes"/>

<xsl:param name="Sortkey"/>

<xsl:template match="Project">
	<xsl:variable name="DescriptionKEY" select="'Description'"/>
	<xsl:variable name="DurationKEY" select="'Duration'"/>
	<xsl:variable name="PriorityKEY" select="'Priority'"/>
	<xsl:variable name="StatusKEY" select="'Status'"/>

	<xsl:call-template name="showParams"/>
	<xsl:element name="Project">
		<xsl:element name="Project">
			<xsl:value-of select="Projectid" />
		</xsl:element>
		<xsl:element name="Description">
			<xsl:value-of select="Description" />
		</xsl:element>
<!--
gave up on this...seems like there should be a way, but I couldn't find it....
		<xsl:variable name="jvKEY" select="'Status'"/>
		<xsl:apply-templates select="Activity">
			<xsl:sort order="ascending" select="$jvKEY"/>
			<xsl:sort order="descending" select="Activity"/>
		</xsl:apply-templates>
-->

		<xsl:choose>
			<xsl:when test="$Sortkey = $DescriptionKEY">
				<xsl:message>description</xsl:message>
				<xsl:apply-templates select="Activity">
					<xsl:sort order="ascending" select="Description"/>
					<xsl:sort order="ascending" select="Activity"/>
				</xsl:apply-templates>
			</xsl:when>
			<xsl:when test="$Sortkey = $DurationKEY">
				<xsl:message>duration</xsl:message>
				<xsl:apply-templates select="Activity">
					<xsl:sort order="ascending" select="Duration" data-type="number"/>
					<xsl:sort order="ascending" select="Activity"/>
				</xsl:apply-templates>
			</xsl:when>
			<xsl:when test="$Sortkey = $PriorityKEY">
				<xsl:message>priority</xsl:message>
				<xsl:apply-templates select="Activity">
					<xsl:sort order="ascending" select="Priority"/>
					<xsl:sort order="ascending" select="Activity"/>
				</xsl:apply-templates>
			</xsl:when>
			<xsl:when test="$Sortkey = $StatusKEY">
				<xsl:message>status</xsl:message>
				<xsl:apply-templates select="Activity">
					<xsl:sort order="ascending" select="Status"/>
					<xsl:sort order="ascending" select="Activity"/>
				</xsl:apply-templates>
			</xsl:when>
			<xsl:otherwise>
				<xsl:apply-templates select="Activity">
					<xsl:sort order="ascending" select="Activity"/>
				</xsl:apply-templates>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:element>
</xsl:template>

<xsl:template match="*|@*|comment()|processing-instruction()|text()">
	<xsl:copy>
		<xsl:apply-templates select="*|@*|comment()|processing-instruction()|text()"/>
	</xsl:copy>
</xsl:template>

<xsl:template name="showParams">
	<xsl:if test="$Sortkey != ''">
	<xsl:message>Sortkey: <xsl:value-of select="$Sortkey"/> </xsl:message>
	</xsl:if>
</xsl:template>

</xsl:stylesheet>

