
package webService;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Usuario;

/**
 *
 * @author david
 */
@WebService(serviceName = "WebServiceUSuario")
public class WebServiceUSuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<Usuario> listar() {
        //TODO write your implementation code here:
        return null;
    }
}
