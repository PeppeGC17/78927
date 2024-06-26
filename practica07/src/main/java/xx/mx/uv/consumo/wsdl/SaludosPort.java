
package xx.mx.uv.consumo.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "saludosPort", targetNamespace = "t4is.uv.mx/saludos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SaludosPort {


    /**
     * 
     * @param saludarRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.SaludarResponse
     */
    @WebMethod(operationName = "Saludar")
    @WebResult(name = "SaludarResponse", targetNamespace = "t4is.uv.mx/saludos", partName = "SaludarResponse")
    public SaludarResponse saludar(
        @WebParam(name = "SaludarRequest", targetNamespace = "t4is.uv.mx/saludos", partName = "SaludarRequest")
        SaludarRequest saludarRequest);

    /**
     * 
     * @param buscarSaludosRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.BuscarSaludosResponse
     */
    @WebMethod(operationName = "BuscarSaludos")
    @WebResult(name = "BuscarSaludosResponse", targetNamespace = "t4is.uv.mx/saludos", partName = "BuscarSaludosResponse")
    public BuscarSaludosResponse buscarSaludos(
        @WebParam(name = "BuscarSaludosRequest", targetNamespace = "t4is.uv.mx/saludos", partName = "BuscarSaludosRequest")
        Object buscarSaludosRequest);

}
