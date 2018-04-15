/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.dominio;

/**
 *
 * @author LIGA
 */
public class Rectangulo {
    private int base ;
    private int altura ;
    private Punto puntoDelRectangulo ;
    
    //Constructores
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base, int altura, Punto punto){
        this.base = base ;
        this.altura = altura ;
        this.puntoDelRectangulo = punto ;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the puntoDelRectangulo
     */
    public Punto getPuntoDelRectangulo() {
        return puntoDelRectangulo;
    }

    /**
     * @param puntoDelRectangulo the puntoDelRectangulo to set
     */
    public void setPuntoDelRectangulo(Punto puntoDelRectangulo) {
        this.puntoDelRectangulo = puntoDelRectangulo;
    }
    
    /**
     * Calcula el perimetro del rectangulo.
     * @return 
     */
    public int obtenerPerimetro(){
        return this.getAltura() * 2 + this.getBase() * 2 ;
    }
    
    /**
     * Calcula la superficie del rectangulo.
     * @return 
     */
    public int obtenerSuperficie(){
        return this.getAltura() * this.getBase() ;
    }
    
    /**
     * Muestra el resto de los puntos apartir de uno.
     */
    public void obtenerOtrosPunto(){
        Punto posicion2 = new Punto( this.puntoDelRectangulo.getPosicionX() , this.puntoDelRectangulo.getPosicionY() + this.altura ) ;
        Punto posicion3 = new Punto( this.puntoDelRectangulo.getPosicionX() + this.getBase() , this.puntoDelRectangulo.getPosicionY() + this.altura ) ;
        Punto posicion4 = new Punto( this.puntoDelRectangulo.getPosicionX() + this.getBase() , this.puntoDelRectangulo.getPosicionY() ) ;
        System.out.println("Punto 2: ") ;
        System.out.println("X= " + posicion2.getPosicionX() );
        System.out.println("Y= " + posicion2.getPosicionY() );
        System.out.println("Punto 3: ") ;
        System.out.println("X= " + posicion3.getPosicionX() );
        System.out.println("Y= " + posicion3.getPosicionY() );
        System.out.println("Punto 4: ") ;
        System.out.println("X= " + posicion4.getPosicionX() );
        System.out.println("Y= " + posicion4.getPosicionY() );
    }
}
