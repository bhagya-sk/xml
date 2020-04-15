<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:pns="http://fedex.com/ws/ship/v17">

	<xsl:output method="xml" indent="yes" version="1.0" />

	<xsl:template match="/">
	  
	  <xsl:element name="ShipReply">
	     <xsl:text>&#10;</xsl:text>
	       
	       <xsl:element name="Notification"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:HighestSeverity"/></xsl:element>
	       <xsl:text>&#10;</xsl:text>
	       
	       
	       
	       
	     <xsl:text>&#10;</xsl:text>
	  </xsl:element>
    </xsl:template>	
</xsl:stylesheet>