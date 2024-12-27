/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import models.Usuario;

/**
 *
 * @author angelsn
 */
public interface UsuarioDAOImp {
    void Registrar(Usuario u);
    void IniciarSesion(String correo, String contrasenia);
    public Usuario SeleccionarUsuarioPorID(int id);
}
