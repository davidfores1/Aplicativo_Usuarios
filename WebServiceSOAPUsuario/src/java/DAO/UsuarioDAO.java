
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.Usuario;

/**
 *
 * @author david
 */
public class UsuarioDAO implements UsuarioCrud {

    //variables
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();

    @Override
    public List listar() {

        List<Usuario> datos = new ArrayList<>();
        String sql = "select * from usuarios";

        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
             Usuario u = new Usuario();
             u.setId(rs.getInt("id"));
             u.setNombre(rs.getString("nombre"));
             u.setApellido(rs.getString("apellido"));
             datos.add(u);
            }
            
        }catch (Exception e) {
            
        }  
        return datos;
    }

    @Override
    public Usuario ListarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
