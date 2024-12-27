/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package angelsn.dataaccessbm;

import dao.UsuarioDAO;
import interfaces.UsuarioDAOImp;
import java.util.Scanner;
import models.Usuario;

/**
 *
 * @author pausa
 */
public class DataAccessBM {

    public static void main(String[] args) {
        System.out.println("Selecciona el DAO que desees probar!");
        System.out.println("1. UsuarioDAO");
        
//        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos a registrarte");
        System.out.println("Ingresa tu nombre");
        String nombre = "pepe";
        System.out.println("Ingresa tu apellido");
        String apellido = "pepe";
        System.out.println("Ingresa tu correo");
        String correo = "pepe";
        System.out.println("Ingrea tu contraseña");
        String pw = "pepe";
        
        UsuarioDAOImp dao = new UsuarioDAO();
        
        dao.Registrar(new Usuario(nombre, apellido, correo, pw));
        dao.IniciarSesion(correo, pw);
    }
}
