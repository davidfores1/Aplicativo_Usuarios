
package DAO;

import java.util.List;
import modelo.Usuario;

public interface UsuarioCrud {
  
    public List listar();
    public Usuario ListarID(int id);
    public String add(String nombre, String apellido);
    public Usuario delete(int id);
    
}
