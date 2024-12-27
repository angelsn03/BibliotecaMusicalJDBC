/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.UsuarioDAO;
import interfaces.UsuarioDAOImp;

import interfaces.UsuarioServiceImp;
import models.Usuario;

/**
 *
 * @author angelsn
 */
public class UsuarioService implements UsuarioServiceImp{

    private final UsuarioDAOImp dao;
    
    public UsuarioService(){
         dao = new UsuarioDAO();
    }
    
    @Override
    public void Registrar(Usuario u) {
        dao.Registrar(u);
    }

    @Override
    public void IniciarSesion(String correo, String contrasenia) {
        dao.IniciarSesion(correo, contrasenia);
    }
    
    @Override
    public Usuario SeleccionarUsuarioporID(int id){
        return dao.SeleccionarUsuarioPorID(id);
    }
}
