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
    private int position;
    private int positionActual = 0;
    private int positionfinal;

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
    
    
    public int establecerPosicionFinal(){  
        int pA;
        pA = establecerPosicionActual();
        
        positionfinal = pA+position;        
        return positionfinal;        
    }
    
    
    
    public int establecerPosicionActual(){        
        positionActual = positionActual+position;
        return positionActual;
    }
    
    
    
    
    
}
