package com.reactiveworks.xsltexcercise.transformation;

import java.io.File;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
public class XmlRequestTransformation {
	
	private static final String XSL_FILE = "XmlRequest.xsl";
	private static final String XML_FILE = "XmlRequest.xml";
	
	public static void xsltTransformer()  {
		
		File xml = new File(XmlRequest2Transformation.class.getClassLoader().getResource(XML_FILE).getFile()) ;
	    File xsl = new File(XmlRequest2Transformation.class.getClassLoader().getResource(XSL_FILE).getFile());
	 
	    TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(xsl);
        Transformer transformer;
		try {
			transformer = factory.newTransformer(xslt);
			Source text = new StreamSource(xml);
	        transformer.transform(text, new StreamResult(System.out));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		xsltTransformer();
	}

}
