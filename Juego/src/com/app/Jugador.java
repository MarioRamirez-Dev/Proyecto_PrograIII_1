/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app;

/**
 *
 * @author Ferch
 */
public class Jugador {
    private String nombre;
    private int position = 0;
    private int posicionAnterior = 0;

    public Jugador() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

     public void setPosition(int position) {
        this.position = position;
    }    
    public int getPosition(){
        return position;
    }

    public int getPosicionAnterior() {
        return posicionAnterior;
    }

    public void setPosicionAnterior(int posicionAnterior) {
        this.posicionAnterior = posicionAnterior;
    }
    
    
    
    
    
    
}
