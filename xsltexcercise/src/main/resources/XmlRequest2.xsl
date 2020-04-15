<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:pns="http://fedex.com/ws/ship/v17">

	<xsl:output method="xml" indent="yes" version="1.0" />

	<xsl:template match="/">
		<xsl:element name="ShipReply">

			<xsl:apply-templates
				select="/SOAP-ENV:Envelope" />
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="/SOAP-ENV:Envelope">
	<xsl:apply-templates select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply" />
	</xsl:template>

	<xsl:template
		match="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply">
		<xsl:text>&#10;</xsl:text>
		<Notification>
			<xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:HighestSeverity" />
		</Notification>
		<xsl:text>&#10;</xsl:text>
		<xsl:copy-of select="./pns:Code" />
		<xsl:text>&#10;</xsl:text>
		<xsl:copy-of select="node()/pns:Message" />
		<xsl:text>&#10;</xsl:text>
		<xsl:element node="CompletedShipmentDetail">

			<xsl:text>&#10;</xsl:text>
			<Carrier>
				<xsl:value-of
					select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CarrierCode" />
			</Carrier>

			<xsl:text>&#10;</xsl:text>

			<ServiceType>Only Service code is available</ServiceType>
			<xsl:text>&#10;</xsl:text>
			<xsl:apply-templates
				select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:OperationalDetail" />

			<xsl:text>&#10;</xsl:text>
		</xsl:element>
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="SequenceNumber">
			<xsl:value-of
				select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:SequenceNumber" />
		</xsl:element>
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="MasterTrackingId">
			<xsl:text>&#10;</xsl:text>
			<TrackingNumber>No MasterTrackingId</TrackingNumber>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
		<xsl:text>&#10;</xsl:text>

		<xsl:copy-of
			select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:TrackingIds" />

		<xsl:text>&#10;</xsl:text>
		<xsl:element name="ManifestMsn">Not Available</xsl:element>
		<xsl:text>&#10;</xsl:text>
		<xsl:apply-templates
			select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label" />

	</xsl:template>

	<xsl:template
		match="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:OperationalDetail">
		<xsl:text>&#10;</xsl:text>
		<xsl:element name="CommitDetails">
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="CommitTimestamp">
				<xsl:value-of select="pns:TransitTime" />
			</xsl:element>
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
	</xsl:template>

	<xsl:template
		match="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail">
		<xsl:copy-of
			select="pns:CompletedShipmentDetail/pns:MasterTrackingId/pns:TrackingNumber"></xsl:copy-of>
	</xsl:template>

	<xsl:template
		match="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label">
		<xsl:element name="Label">
			<xsl:text>&#10;</xsl:text>
			<xsl:copy-of select="pns:Type" />
			<xsl:text>&#10;</xsl:text>
			<xsl:copy-of select="pns:ImageType" />
			<xsl:text>&#10;</xsl:text>
			<xsl:copy-of select="pns:Resolution" />
			<xsl:text>&#10;</xsl:text>
			<xsl:copy-of select="node()/pns:Image" />
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
		<xsl:text>&#10;</xsl:text>
	</xsl:template>

</xsl:stylesheet>