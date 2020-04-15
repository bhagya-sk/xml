package com.reactiveworks.xslt.transformations;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlTransformer {
	//private static Document document;
	private static final String XSL_FILE = "XmlRequest.xsl";
	private static final String XML_FILE = "XmlRequest.xml";
	
	public static void xsltTransformer() throws ParserConfigurationException, SAXException, IOException, TransformerException {
	//	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 
	    File xml = new File(XmlTransformer.class.getClassLoader().getResource(XML_FILE).getFile()) ;
	    File xsl = new File(XmlTransformer.class.getClassLoader().getResource(XSL_FILE).getFile());
	 
//	    DocumentBuilder builder = factory.newDocumentBuilder();
//	    document = builder.parse(xml);
	
//	    //Transformer for output
//	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
//	    StreamSource style = new StreamSource(xsl);
//	    Transformer transformer = transformerFactory.newTransformer(style);
//	 
//	    DOMSource source = new DOMSource(document);
//	    StreamResult result = new StreamResult(System.out);
//	    transformer.transform(source, result);
	    
	    TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(xsl);
        Transformer transformer = factory.newTransformer(xslt);

        Source text = new StreamSource(xml);
        transformer.transform(text, new StreamResult(System.out));
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		xsltTransformer();
	}

	
}
