/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.awt.geom.Rectangle2D;


public class Pelota {

    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private static double y = 0;
    private double dx = 1;
    private double dy = 1;
   
    private Integer score1 = 0, score2 = 0;
    public static boolean finJuego = false;


    
    //retorna la pelota (Rectangle2D implementa la interface Shape)
    public Rectangle2D getShape() {
        return new Rectangle2D.Double(x, y, TAMX, TAMY);
    }

    public void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x += dx;
        y += dy;



    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    
    
}
