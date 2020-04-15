<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">

	<xsl:output method="xml" version="1.0" />

	<xsl:template match="/">

		<xsl:text>&#10;</xsl:text>
		<soapenv:Envelope>
			<xsl:text>&#10;</xsl:text>
			<soapenv:body>
				<xsl:text>&#10;</xsl:text>
				<ProcessShipmentRequest>
					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/WebAuthenticationDetail" />
					<xsl:apply-templates
						select="/Shipment/ClientDetail" />
					<xsl:apply-templates select="/Shipment/Version" />

					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/RequestedShipment" />


					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/Sender/Contact" />


					<xsl:text>&#10;</xsl:text>

					<xsl:apply-templates
						select="/Shipment/Sender/Address" />


					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/Recipient/Contact" />


					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/Recipient/Address" />


					<xsl:text>&#10;</xsl:text>
					<xsl:apply-templates
						select="/Shipment/ShippingChargesPayment" />
				</ProcessShipmentRequest>
			</soapenv:body>
		</soapenv:Envelope>
	</xsl:template>

	<xsl:template match="/Shipment/WebAuthenticationDetail">

		<xsl:copy-of select="/Shipment/WebAuthenticationDetail" />

	</xsl:template>


	<xsl:template match="/Shipment/ClientDetail">

		<xsl:copy-of select="/Shipment/ClientDetail" />
		<xsl:text>&#10;</xsl:text>
	</xsl:template>


	<xsl:template match="/Shipment/Version">

		<xsl:copy-of select="/Shipment/Version" />

	</xsl:template>


	<xsl:template match="/Shipment">

		<xsl:apply-templates
			select="/Shipment/Packages/Package" />

		<xsl:copy-of
			select="/Shipment/RequestedShipment/DropoffType" />
		<PackagingType>YOUR_PACKAGING</PackagingType>

		<xsl:text>&#10;</xsl:text>
		<xsl:copy-of select="/Shipment/RequestedShipment" />

	</xsl:template>

	<xsl:template match="/Shipment">
		<RequestedShipment>

			<xsl:apply-templates
				select="/Shipment/Packages/Package" />
			<xsl:apply-templates
				select="/Shipment/RequestedShipment" />
			<xsl:copy-of
				select="/Shipment/ServiceVal/HostServiceType/HostNaming/HostName/Service" />

			<Shipper>
				<xsl:copy-of select="/Shipment/Sender/Contact" />
				<xsl:copy-of select="/Shipment/Sender/Address" />
			</Shipper>

			<Recipient>
				<xsl:copy-of select="/Shipment/Recipient/Contact" />
				<xsl:copy-of select="/Shipment/Recipient/Address" />
			</Recipient>

			<ShippingChargesPayment>
				<xsl:copy-of
					select="/Shipment/ShippingChargesPayment/PaymentType" />
				<Payor>
					<ResponsibleParty>
						<xsl:copy-of
							select="/Shipment/ClientDetail/AccountNumber" />

						<Address>
							<PostalCode />
							<CountryCode>US</CountryCode>
						</Address>
					</ResponsibleParty>
				</Payor>
			</ShippingChargesPayment>

			<xsl:apply-templates
				select="/Shipment/LabelSpecification" />

			<PackageCount>
				<xsl:value-of select="/Shipment/Packages/PackageCount" />
			</PackageCount>

			<RequestedPackageLineItems>
				<xsl:copy-of select="/Shipment/Packages/Weight" />
				<xsl:copy-of select="/Shipment/Packages/Dimensions" />
			</RequestedPackageLineItems>

		</RequestedShipment>
	</xsl:template>

	<xsl:template match="/Shipment/LabelSpecification">
		<LabelFormatType>COMMON2D</LabelFormatType>
		<xsl:copy-of
			select="/Shipment/LabelSpecification/LabelSpecification/ImageType" />
	</xsl:template>

	<xsl:template match="/Shipment/Packages/Package">
		<ShipTimestamp>
			<xsl:value-of
				select="/Shipment/RequestedShipment/ShipDate" />
		</ShipTimestamp>
		<xsl:copy-of
			select="/Shipment/RequestedShipment/DropoffType" />
	</xsl:template>

	<xsl:template match="/Shipment/RequestedShipment">

		<xsl:copy-of
			select="/Shipment/RequestedShipment/PackagingType" />

	</xsl:template>


	<xsl:template match="/Shipment/Sender/Contact">

		<xsl:copy-of select="/Shipment/Sender/Contact" />

	</xsl:template>

	<xsl:template match="/Shipment/Sender/Address">

		<xsl:copy-of select="/Shipment/Sender/Address" />

	</xsl:template>

	<xsl:template match="/Shipment/Recipient/Contact">

		<xsl:copy-of select="/Shipment/Recipient/Contact" />

	</xsl:template>

	<xsl:template match="/Shipment/Recipient/Address">

		<xsl:copy-of select="/Shipment/Recipient/Address" />

	</xsl:template>

	<xsl:template match="/Shipment/ShippingChargesPayment">

		<xsl:copy-of select="/Shipment/ShippingChargesPayment" />

	</xsl:template>


</xsl:stylesheet>