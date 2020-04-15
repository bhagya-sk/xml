<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:pns="http://fedex.com/ws/ship/v17">

	<xsl:output method="xml" indent="yes" version="1.0" />

	<xsl:template match="/">
	<xsl:text>&#10;</xsl:text>
		
		<xsl:element name="ShipReply">
			<xsl:text>&#10;</xsl:text>
			<xsl:element name="Notification">
	            <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:HighestSeverity"/>
	        </xsl:element>
	        <xsl:text>&#10;</xsl:text>
	     
     <xsl:element name="Code"> 
	            <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:Notifications/pns:Code"/>
	     </xsl:element>
	     <xsl:text>&#10;</xsl:text>
	     
	      <xsl:element name="Message">
	            <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:Notifications/pns:Message"/>
	     </xsl:element>
	     <xsl:text>&#10;</xsl:text>
	     
	     <xsl:element name="CompletedShipmentDetail">
	        <xsl:text>&#10;</xsl:text>
	        <xsl:element name="Carrier"> <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CarrierCode"/></xsl:element>
	        <xsl:text>&#10;</xsl:text>
	        <xsl:choose>
	          <xsl:when test="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail[not(pns:ServiceType)] ">
	              <xsl:element name="ServiceType"> Only Service code is available</xsl:element>
	          </xsl:when>
	          
	          <xsl:otherwise>
	          <xsl:element name="ServiceType"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:ServiceType"></xsl:value-of> </xsl:element>
	          </xsl:otherwise>
	        </xsl:choose>
	      
	        <xsl:text>&#10;</xsl:text>
	        <xsl:element name="CommitDetails">
	         <xsl:text>&#10;</xsl:text>
	           <xsl:element name="CommitTimestamp">
	              <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:OperationalDetail/pns:TransitTime"/>
	           </xsl:element>
	           <xsl:text>&#10;</xsl:text>
	        </xsl:element>
	        <xsl:text>&#10;</xsl:text>
	    
	        <xsl:element name="SequenceNumber">
	           <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:SequenceNumber"/>
	        </xsl:element>
	        <xsl:text>&#10;</xsl:text>
	        
	      <xsl:element name="MasterTrackingId">
	           <xsl:text>&#10;</xsl:text>
	           
	           <xsl:choose>
	              <xsl:when test="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:MasterTrackingId[not(pns:TrackingNumber)]">
	                <xsl:element name="TrackingNumber">No MasterTrackingId</xsl:element>
	              </xsl:when>
	               
	              <xsl:otherwise>
	                 <xsl:element name="TrackingNumber"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:MasterTrackingId/pns:TrackingNumber"/></xsl:element>
	              </xsl:otherwise>
	           </xsl:choose>
	         
	            
	            <xsl:text>&#10;</xsl:text>
	      </xsl:element>    
	    <xsl:text>&#10;</xsl:text>
	    
	    <xsl:element name="TrackingIds">
	    <xsl:text>&#10;</xsl:text>
	    <xsl:element name="TrackingNumber">
	     <xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:TrackingIds/pns:TrackingNumber"/>
	    </xsl:element>
	    <xsl:text>&#10;</xsl:text>
	    </xsl:element>
	    <xsl:text>&#10;</xsl:text>
	    
	    <xsl:element name="ManifestMsn">Not Available</xsl:element>
	    <xsl:text>&#10;</xsl:text>
	    
	    <xsl:element name="Label">
			<xsl:text>&#10;</xsl:text>
		<xsl:element name="Type"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label/pns:Type" /></xsl:element>	
			<xsl:text>&#10;</xsl:text>
		<xsl:element name="ImageType"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label/pns:ImageType" /></xsl:element>	
			<xsl:text>&#10;</xsl:text>
		<xsl:element name="Resolution"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label/pns:Resolution" /></xsl:element>	
			<xsl:text>&#10;</xsl:text>
		<xsl:element name="Image"><xsl:value-of select="/SOAP-ENV:Envelope/SOAP-ENV:Body/pns:ProcessShipmentReply/pns:CompletedShipmentDetail/pns:CompletedPackageDetails/pns:Label/pns:Parts/pns:Image" /></xsl:element>	
			<xsl:text>&#10;</xsl:text>
		</xsl:element>
	    
	     <xsl:text>&#10;</xsl:text>
	     </xsl:element>
	     
	     <xsl:text>&#10;</xsl:text> 
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>