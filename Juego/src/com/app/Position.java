/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app;

/**
 *
 * @author Ferch
 */
public class Position {
    int position;
    int x = 0;
    int y = 0;
    public Position() {
        
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public int getY(){
        if(position <=6){
            y = 410;
        }else if(position > 6 && position <=12){
            y = 310;
        }else if(position > 12 && position <=18){
            y = 210;
        }else if(position >18 && position <=24){
            y = 110;
        }else if(position >24 && position <=30){
            y = 10;
        }
        return y;
    }
    public int getX(){
        if(position == 1 || position == 12 || position == 13 || position == 24 || position == 25){
            x = 10;
        }else if(position == 2 || position == 11 || position == 14 || position == 23 || position == 26){
            x = 110;
        }else if(position == 3 || position == 10 || position == 15 || position == 22 || position == 27){
            x = 210;
        }else if(position == 4 || position == 9 || position == 16 || position == 21 || position == 28){
            x = 310;
        }else if(position == 5 || position == 8 || position == 17 || position == 20 || position == 29){
            x = 410;
        }else if(position == 6 || position == 7 || position == 18 || position == 19 || position == 30){
            x = 510;
        }
        return x;
    }
}
