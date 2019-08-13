
package soap.primosserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.up.bsi.soap.progserver package. 
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

    private final static QName _ProgressArit_QNAME = new QName("http://progserver.soap.bsi.up.edu/", "ProgressArit");
    private final static QName _ProgressAritResponse_QNAME = new QName("http://progserver.soap.bsi.up.edu/", "ProgressAritResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.up.bsi.soap.progserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrimosPort }
     * 
     */
    public PrimosPort createProgressArit() {
        return new PrimosPort();
    }

    /**
     * Create an instance of {@link PrimosCalcResponse }
     * 
     */
    public PrimosCalcResponse createProgressAritResponse() {
        return new PrimosCalcResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimosPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://progserver.soap.bsi.up.edu/", name = "ProgressArit")
    public JAXBElement<PrimosPort> createProgressArit(PrimosPort value) {
        return new JAXBElement<PrimosPort>(_ProgressArit_QNAME, PrimosPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimosCalcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://progserver.soap.bsi.up.edu/", name = "ProgressAritResponse")
    public JAXBElement<PrimosCalcResponse> createProgressAritResponse(PrimosCalcResponse value) {
        return new JAXBElement<PrimosCalcResponse>(_ProgressAritResponse_QNAME, PrimosCalcResponse.class, null, value);
    }

}
