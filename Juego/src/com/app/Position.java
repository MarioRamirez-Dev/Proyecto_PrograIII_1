
package com.app;

/**
 *
 * 
 */
public class Position {
    int position = 0;
    int x ;
    int y ;
    int puntaje ;
    int totalMovimiento ;

    
    public Position() {
       
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public int posicionFicha(int valorDado){        
        totalMovimiento = puntaje + valorDado;
        position = totalMovimiento; 
        
        return position;
    }
    
    public int getX(){
        int x1 = 0;
              position = x1+position;
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
    
    public int getY(){
        int y1 = 0;
                position= y1+position;
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
    
    
    
    
 
    
}
