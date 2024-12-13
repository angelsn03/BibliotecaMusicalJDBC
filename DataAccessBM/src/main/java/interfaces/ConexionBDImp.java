/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import connection.ConexionBD;
import java.sql.Connection;

/**
 *
 * @author angelsn
 */
public interface ConexionBDImp {
    public Connection getConnection();
}
