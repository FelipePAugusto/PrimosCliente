
package soap.primosserver;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PrimosCalc", targetNamespace = "http://progserver.soap.bsi.up.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PrimosCalc {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(operationName = "ProgressArit")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProgressArit", targetNamespace = "http://progserver.soap.bsi.up.edu/", className = "edu.up.bsi.soap.progserver.ProgressArit")
    @ResponseWrapper(localName = "ProgressAritResponse", targetNamespace = "http://progserver.soap.bsi.up.edu/", className = "edu.up.bsi.soap.progserver.ProgressAritResponse")
    @Action(input = "http://progserver.soap.bsi.up.edu/ProgressaoCalc/ProgressAritRequest", output = "http://progserver.soap.bsi.up.edu/ProgressaoCalc/ProgressAritResponse")
    public int[] progressArit(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
