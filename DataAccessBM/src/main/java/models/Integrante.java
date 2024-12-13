/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;
/**
 *
 * @author angelsn
 */
public class Integrante {
    private int id;
    private int idArtista;
    private String nombre;
    private String apellido;
    private String rol;
    private Date fechaIngreso;
    private Date fechaSalida;
    private boolean estadoActivo;

    public Integrante(int idArtista, String nombre, String apellido, String rol, Date fechaIngreso, Date fechaSalida, boolean estadoActivo) {
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoActivo = estadoActivo;
    }

    public int getId() {
        return id;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }
    
    
}
