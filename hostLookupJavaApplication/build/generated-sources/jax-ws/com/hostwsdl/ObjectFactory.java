
package com.hostwsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hostwsdl package. 
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

    private final static QName _Host_QNAME = new QName("http://hostws.com/", "host");
    private final static QName _HostResponse_QNAME = new QName("http://hostws.com/", "hostResponse");
    private final static QName _UnknownHostException_QNAME = new QName("http://hostws.com/", "UnknownHostException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hostwsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnknownHostException }
     * 
     */
    public UnknownHostException createUnknownHostException() {
        return new UnknownHostException();
    }

    /**
     * Create an instance of {@link Host }
     * 
     */
    public Host createHost() {
        return new Host();
    }

    /**
     * Create an instance of {@link HostResponse }
     * 
     */
    public HostResponse createHostResponse() {
        return new HostResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Host }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hostws.com/", name = "host")
    public JAXBElement<Host> createHost(Host value) {
        return new JAXBElement<Host>(_Host_QNAME, Host.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hostws.com/", name = "hostResponse")
    public JAXBElement<HostResponse> createHostResponse(HostResponse value) {
        return new JAXBElement<HostResponse>(_HostResponse_QNAME, HostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownHostException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hostws.com/", name = "UnknownHostException")
    public JAXBElement<UnknownHostException> createUnknownHostException(UnknownHostException value) {
        return new JAXBElement<UnknownHostException>(_UnknownHostException_QNAME, UnknownHostException.class, null, value);
    }

}
