//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.20 at 03:09:31 PM ICT 
//


package com.napas.ach.testjackson.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.napas.ach.testjackson.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NapasDocument_QNAME = new QName("", "NapasDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.napas.ach.testjackson.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NapasDocument }
     * 
     */
    public NapasDocument createNapasDocument() {
        return new NapasDocument();
    }

    /**
     * Create an instance of {@link ChucNang }
     * 
     */
    public ChucNang createChucNang() {
        return new ChucNang();
    }

    /**
     * Create an instance of {@link NapasDocumentPayload }
     * 
     */
    public NapasDocumentPayload createNapasDocumentPayload() {
        return new NapasDocumentPayload();
    }

    /**
     * Create an instance of {@link NapasAgent }
     * 
     */
    public NapasAgent createNapasAgent() {
        return new NapasAgent();
    }

    /**
     * Create an instance of {@link Phong }
     * 
     */
    public Phong createPhong() {
        return new Phong();
    }

    /**
     * Create an instance of {@link NapasDocumentHeader }
     * 
     */
    public NapasDocumentHeader createNapasDocumentHeader() {
        return new NapasDocumentHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NapasDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NapasDocument")
    public JAXBElement<NapasDocument> createNapasDocument(NapasDocument value) {
        return new JAXBElement<NapasDocument>(_NapasDocument_QNAME, NapasDocument.class, null, value);
    }

}
