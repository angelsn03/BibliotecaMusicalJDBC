
package connection;

import interfaces.ConexionBDImp;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author angelsn
 */
public class ConexionBD implements ConexionBDImp{
    
    public static ConexionBD conexion;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/bibliotecamusical2";
    private String user = "root";
    private String password = "admin";
    
    private ConexionBD(){
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", ERROR_MESSAGE);
        }
    }
    
    public static ConexionBD getInstance(){
        if(conexion == null){
            conexion = new ConexionBD();
        }
        return conexion;
    }
 
    @Override
    public Connection getConnection(){
        return connection;
    }
}
