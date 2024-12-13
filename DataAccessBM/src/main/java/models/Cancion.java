/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author angelsn
 */
public class Cancion {
    private int id;
    private String titulo;
    private String duracion;
    private int idAlbum;

    public Cancion(String titulo, String duracion, int idAlbum) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.idAlbum = idAlbum;
    }
    
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getIdAlbum() {
        return idAlbum;
    }
    
}
