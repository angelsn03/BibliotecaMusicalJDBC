
package dao;

import connection.ConexionBD;
import interfaces.UsuarioDAOImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import models.Usuario;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author pausa
 */
public class UsuarioDAO implements UsuarioDAOImp{
    private ConexionBD bd;
    private Connection connection;
    public UsuarioDAO() {
        this.bd = ConexionBD.getInstance();
        this.connection = bd.getConnection();
    }
    
    @Override
    public void Registrar(Usuario u){
        if (isRegistrado(u.getCorreo())) {
            JOptionPane.showMessageDialog(
                    null, "Ya existe un usuario con esta contraseña!", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        String query = "INSERT INTO usuarios (nombre, apellido, correo, contrasenia) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = connection
                    .prepareStatement(query);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCorreo());
            ps.setString(4, encriptarContrasenia(u.getContrasenia()));
            ps.setString(4, u.getImagen());
            ps.executeUpdate();
            System.out.println("Usuario registrado con éxito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "falsió: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("falsió, checa "+e.getMessage());
        }
    }
    
    @Override
    public void IniciarSesion(String correo, String contrasenia){
        String query = "SELECT contrasenia FROM usuarios WHERE correo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String hashGuardado = rs.getString("contrasenia");
                if (BCrypt.checkpw(contrasenia, hashGuardado)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe un usuario con este correo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar iniciar sesión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error al intentar iniciar sesión: " + e.getMessage());
        }
    }
    
    @Override
    public Usuario SeleccionarUsuarioPorID(int id){
        String query = "SELECT * FROM usuarios WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String contrasenia = rs.getString("contrasenia");
                return new Usuario(nombre, apellido, correo, contrasenia);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar al usuario por su Id: " + e.getMessage());
        }
        return null;
    }
    
    private boolean isRegistrado(String correo){
        String query = "SELECT COUNT(*) FROM usuarios WHERE correo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Si ya existe al menos un usuario con ese correo
            }
        } catch (Exception e) {
            System.err.println("Error al verificar si el usuario está registrado: " + e.getMessage());
        }
        return false;
    }
    
    private String encriptarContrasenia(String contrasenia){
        return BCrypt.hashpw(contrasenia, BCrypt.gensalt(12));
    }
}
