/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author pausa
 */
public class Usuario {
    private int id;
    private  String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String imagen;
    private Timestamp fechaRegistro;

    public Usuario(String nombre, String apellido, String correo, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.imagen = "/usuarios/"+nombre+".png";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getImagen() {
        return imagen;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }
    
    
}
