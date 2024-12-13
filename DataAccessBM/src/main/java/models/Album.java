/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Image;
import java.io.InputStream;
import java.sql.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author angelsn
 */
public class Album {
    private int id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portada;
    private int idArtista;

    public Album(String nombre, Date fechaLanzamiento, String genero, String portada, int idArtista) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = "/albumes/"+nombre+".png";
        this.idArtista = idArtista;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public ImageIcon getPortada() {
        try {
            InputStream is = getClass().getResourceAsStream(portada);
            if (is != null) {
                Image image = ImageIO.read(is);
                Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            } else {
                // Devuelve una imagen por defecto desde el classpath
                is = getClass().getResourceAsStream("/artistas/default_image.png");
                Image image = ImageIO.read(is);
                Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getIdArtista() {
        return idArtista;
    }
    
    
}
