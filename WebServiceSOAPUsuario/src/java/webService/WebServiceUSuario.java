package webService;

import DAO.UsuarioDAO;
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
    UsuarioDAO dao = new UsuarioDAO();

    @WebMethod(operationName = "listar")
    public List<Usuario> listar() {
        List datos = dao.listar();

        return datos;
    }
}
