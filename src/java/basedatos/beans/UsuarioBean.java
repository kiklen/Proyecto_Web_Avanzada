package basedatos.beans;

import basedatos.AccesoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Taller Java
 */
public class UsuarioBean {

    private String usuario = "";
    private String password = "";
    private String nombre = "";
    private String categoria="";

    public UsuarioBean() {
    }

    /**
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *Para recuperar
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     *Para modificarlo
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of usuario
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Verifica la existencia del usuario
     * @return estado de la busqueda
     */
    public boolean buscarUsuario() {
        String sql = "SELECT * FROM usuario "
                + " WHERE usuario='" + this.usuario 
                + "' AND password='" + this.password + "'";

        ResultSet tabla = AccesoBD.ejecutarSQLSelect(sql);

        if (tabla == null) {
            return false;
        } else {
            try {
                if (tabla.next()) {
                    nombre = tabla.getString("nombre");
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                return false;
            }
        }
    }
    
    public boolean buscaUsuario() {
        String sql = "SELECT * FROM usuario "
                + " WHERE usuario='" + this.usuario + "'";

        ResultSet tabla = AccesoBD.ejecutarSQLSelect(sql);

        if (tabla == null) {
            return false;
        } else {
            try {
                if (tabla.next()) {
                    this.nombre = tabla.getString("nombre");
                    this.usuario = tabla.getString("usuario");
                    this.password = tabla.getString("password");
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                return false;
            }
        }
    }
    
    /**
     * Agrega un registro a la tabla de producto
     * @return estado de la operación
     */
    public boolean insertarUsuario() {
        String sql = "INSERT INTO usuario(usuario,password,nombre)"
                + " VALUES('" + this.usuario + "','" + this.password                
                + this.nombre +  ")";

        if (AccesoBD.ejecutarSQL(sql)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Actualiza la información del registro indicado
     * @return estado de la operación
     */
    public boolean actualizarUsuario() {
        String sql = "UPDATE usuario SET "
                + "password = '" + this.password + "',"                
                + "nombre =  " + this.nombre + "',"                
                + " WHERE usuario='" + this.usuario + "'";

        if (AccesoBD.ejecutarSQL(sql)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminarUsuario() {
        String sql = "DELETE usuario "               
                + " WHERE usuario='" + this.usuario + "'";

        if (AccesoBD.ejecutarSQL(sql)) {
            return true;
        } else {
            return false;
        }
    }
}