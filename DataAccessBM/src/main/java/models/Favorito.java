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
public class Favorito {
    private int id;
    private int idUsuario;
    private int idCancion;
    private Timestamp fechaAgregado;

    public Favorito(int idUsuario, int idCancion, Timestamp fechaAgregado) {
        this.idUsuario = idUsuario;
        this.idCancion = idCancion;
        this.fechaAgregado = fechaAgregado;
    }

    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public Timestamp getFechaAgregado() {
        return fechaAgregado;
    }
    
    
}
