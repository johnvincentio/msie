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

<xsl:template match="Activity">
	<xsl:message>Current Act: <xsl:value-of select="Activityid"/> </xsl:message>
	<xsl:choose>
		<xsl:when test="Activityid = $EditActivityId">
			<xsl:message>equal</xsl:message>

			<xsl:element name="Activity">
				<xsl:element name="Activityid">
					<xsl:value-of select="Activityid/text()" />
				</xsl:element>

				<xsl:element name="Description">
					<xsl:choose>
						<xsl:when test="$EditDescription != ''">
							<xsl:value-of select="$EditDescription"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="Description/text()" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>

				<xsl:element name="Duration">
					<xsl:choose>
						<xsl:when test="$EditDuration != ''">
							<xsl:value-of select="$EditDuration"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="Duration/text()" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>

				<xsl:element name="Priority">
					<xsl:choose>
						<xsl:when test="$EditPriority != ''">
							<xsl:value-of select="$EditPriority"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="Priority/text()" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>

				<xsl:element name="Status">
					<xsl:choose>
						<xsl:when test="$EditStatus != ''">
							<xsl:value-of select="$EditStatus"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="Status/text()" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>

			</xsl:element>

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

