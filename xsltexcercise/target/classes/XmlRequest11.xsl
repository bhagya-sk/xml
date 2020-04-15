<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:output method="xml" indent="yes" version="1.0" />

	<xsl:template match="/">

		<xsl:text>&#10;</xsl:text>
		<soapenv:Envelope>
			<xsl:text>&#10;</xsl:text>
			<soapenv:body>
				<xsl:text>&#10;</xsl:text>
				<ProcessShipmentRequest>
					<xsl:text>&#10;</xsl:text>
					
					<xsl:element name="WebAuthenticationDetail"><xsl:value-of select="/Shipment/WebAuthenticationDetail" /></xsl:element>
					
					<xsl:element name="ClientDetail"><xsl:copy-of select="/Shipment/ClientDetail" /></xsl:element>
					
					<xsl:element name="Version"><xsl:copy-of select="/Shipment/Version" /></xsl:element>
					
					<xsl:element name="Version"><xsl:copy-of select="/Shipment/Version" /></xsl:element>
					
					<xsl:element name="RequestedShipment">
					  
					   <xsl:element name="ShipTimestamp"> <xsl:value-of select="/Shipment/RequestedShipment/ShipDate" /> </xsl:element>
				       <xsl:element name="DropoffType"> <xsl:value-of select="/Shipment/RequestedShipment/DropoffType" />  </xsl:element>
		               <xsl:element name="ServiceType"> <xsl:value-of select="/Shipment/ServiceVal/HostServiceType/HostNaming/HostName/Service" /></xsl:element>
		               <xsl:element name="PackagingType"><xsl:copy-of select="/Shipment/RequestedShipment/PackagingType" /></xsl:element>
		               
		               <xsl:element name="Shipper">
				         <xsl:copy-of select="/Shipment/Sender/Contact" />
				         <xsl:copy-of select="/Shipment/Sender/Address" />
			           </xsl:element>

						<xsl:element name="Recipient">
							<xsl:copy-of select="/Shipment/Recipient/Contact" />
							<xsl:copy-of select="/Shipment/Recipient/Address" />
						</xsl:element>
						
						<xsl:element name="ShippingChargesPayment">
						<xsl:copy-of
							select="/Shipment/ShippingChargesPayment/PaymentType" />
						<xsl:element name="Payor">
							<xsl:element name="ResponsibleParty">
								<xsl:copy-of
									select="/Shipment/ClientDetail/AccountNumber" />
		
								<xsl:element name="Address">
									<PostalCode />
									<CountryCode>US</CountryCode>
								</xsl:element>
							</xsl:element>
						</xsl:element>
					</xsl:element>
					
					<xsl:element name="LabelSpecification">
				    <xsl:element name="LabelFormatType">COMMON2D</xsl:element>
		            <xsl:copy-of  select="/Shipment/LabelSpecification/ImageType" />
					</xsl:element>
					
					<xsl:element name="PackageCount">
				     <xsl:value-of select="/Shipment/Packages/PackageCount" />
			        </xsl:element>	
			        
			        <xsl:for-each select="/Shipment/Packages/Package">
			        <xsl:element name="RequestedPackageLineItems">
				    <xsl:copy-of select="./Weight" />
				    <xsl:copy-of select="./Dimensions" />
			        </xsl:element>
			        </xsl:for-each>
			        
			       </xsl:element>
					
				</ProcessShipmentRequest>
			</soapenv:body>
			<xsl:text>&#10;</xsl:text>
		</soapenv:Envelope>
		<xsl:text>&#10;</xsl:text>
	</xsl:template>
</xsl:stylesheet>					
					