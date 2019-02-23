/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lluvia;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Enyerson
 */
public class gota  {
     int tam=3;
     int yMax=100;
     int posX=0;
     int posY=0;
    JFrame jf;
   

    public gota(int width) {
        this.posY=(int)(Math.random()*width);
        this.posX=(int)(Math.random()*width);
        this.yMax=width;
        
    }

    public int getX() {
        return tam;
    }

    public void setX(int x) {
        this.tam = x;
    }

   

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public  int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
   
    public void moverGota(){
        posY=posY+5;
        if(posY>=yMax)
        posY=0;
            
    }
  
public void gotas(Graphics g){
    this.moverGota();
    g.fillRect(posX, posY, tam, tam);
    
}
    
    


   
    
    
    
}
