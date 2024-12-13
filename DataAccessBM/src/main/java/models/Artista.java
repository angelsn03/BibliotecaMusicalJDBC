/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Image;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author pausa
 */
public class Artista {
    private int id;
    private String nombre;
    private String tipo; // "solista" o "banda"
    private String imagen;
    private String genero;

    public Artista(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = "/artistas/"+nombre+".png";
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public ImageIcon getImagen() {
        try {
            InputStream is = getClass().getResourceAsStream(imagen);
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

    public String getGenero() {
        return genero;
    }
    
    
}
