
package modelo;

/**
 *
 * @author david
 */
public class UsuariosService {
    
    public UsuariosService(){
    
    }

    public java.util.List<webservice.Usuario> listar() {
        webservice.WebServiceUSuario_Service service = new webservice.WebServiceUSuario_Service();
        webservice.WebServiceUSuario port = service.getWebServiceUSuarioPort();
        return port.listar();
    }
    
}
