/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto06.dominio;

/**
 *
 * @author Lenovo
 */
public class Punto {
    private int posicionX ;
    private int posicionY ;

    //Constructor
    public Punto(){
    
    }
    
    public Punto(int X, int Y){
        this.posicionX = X ;
        this.posicionY = Y ;
    }
    /**
     * @return the posicionX
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * @param posicionX the posicionX to set
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * @return the posicionY
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * @param posicionY the posicionY to set
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
 
        /**
     * Recibe un segundo punto y calcula la distancia por medio de
     * una formula.
     * @param punto2
     * @return 
     */
    public double obtenerDistanciaEntrePuntos(Punto punto2 ){
        //double diferenciaX = Math.pow( (punto2.getPosicionX() - this.getPosicionX()) , 2 );
        //double diferenciaY = Math.pow( (punto2.getPosicionY() - this.getPosicionY()) , 2 );
        //return Math.sqrt(diferenciaX + diferenciaY) ;

        return Math.sqrt( Math.pow( (punto2.getPosicionX() - this.getPosicionX() ) , 2) + Math.pow( (punto2.getPosicionY() - this.getPosicionY() ) , 2)  );

    }
}
