
package com.ws.app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.app package. 
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

    private final static QName _Save_QNAME = new QName("http://app.ws.com/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://app.ws.com/", "saveResponse");
    private final static QName _GetAllPerson_QNAME = new QName("http://app.ws.com/", "getAllPerson");
    private final static QName _GetAllPersonResponse_QNAME = new QName("http://app.ws.com/", "getAllPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllPerson }
     * 
     */
    public GetAllPerson createGetAllPerson() {
        return new GetAllPerson();
    }

    /**
     * Create an instance of {@link GetAllPersonResponse }
     * 
     */
    public GetAllPersonResponse createGetAllPersonResponse() {
        return new GetAllPersonResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.ws.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.ws.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.ws.com/", name = "getAllPerson")
    public JAXBElement<GetAllPerson> createGetAllPerson(GetAllPerson value) {
        return new JAXBElement<GetAllPerson>(_GetAllPerson_QNAME, GetAllPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.ws.com/", name = "getAllPersonResponse")
    public JAXBElement<GetAllPersonResponse> createGetAllPersonResponse(GetAllPersonResponse value) {
        return new JAXBElement<GetAllPersonResponse>(_GetAllPersonResponse_QNAME, GetAllPersonResponse.class, null, value);
    }

}
