
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _ConvertResponse_QNAME = new QName("http://ws/", "convertResponse");
    private final static QName _GetListCompte_QNAME = new QName("http://ws/", "getListCompte");
    private final static QName _GetListCompteResponse_QNAME = new QName("http://ws/", "getListCompteResponse");
    private final static QName _GetCmpt_QNAME = new QName("http://ws/", "getCmpt");
    private final static QName _Convert_QNAME = new QName("http://ws/", "convert");
    private final static QName _GetCmptResponse_QNAME = new QName("http://ws/", "getCmptResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link GetListCompte }
     * 
     */
    public GetListCompte createGetListCompte() {
        return new GetListCompte();
    }

    /**
     * Create an instance of {@link GetListCompteResponse }
     * 
     */
    public GetListCompteResponse createGetListCompteResponse() {
        return new GetListCompteResponse();
    }

    /**
     * Create an instance of {@link GetCmpt }
     * 
     */
    public GetCmpt createGetCmpt() {
        return new GetCmpt();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link GetCmptResponse }
     * 
     */
    public GetCmptResponse createGetCmptResponse() {
        return new GetCmptResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<ConvertResponse>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListCompte")
    public JAXBElement<GetListCompte> createGetListCompte(GetListCompte value) {
        return new JAXBElement<GetListCompte>(_GetListCompte_QNAME, GetListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListCompteResponse")
    public JAXBElement<GetListCompteResponse> createGetListCompteResponse(GetListCompteResponse value) {
        return new JAXBElement<GetListCompteResponse>(_GetListCompteResponse_QNAME, GetListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCmpt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCmpt")
    public JAXBElement<GetCmpt> createGetCmpt(GetCmpt value) {
        return new JAXBElement<GetCmpt>(_GetCmpt_QNAME, GetCmpt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<Convert>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCmptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCmptResponse")
    public JAXBElement<GetCmptResponse> createGetCmptResponse(GetCmptResponse value) {
        return new JAXBElement<GetCmptResponse>(_GetCmptResponse_QNAME, GetCmptResponse.class, null, value);
    }

}
