/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import panels.*;

/**
 *
 * @author angelsn
 */
public class Frame extends JFrame{
    public Frame(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BibliotecaMusical2");
        JPanel reg = new frmSignIn();
        this.add(reg);
    }
}
