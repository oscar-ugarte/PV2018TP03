/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto03.dominio;

/**
 *
 * @author LIGA
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    
    //Constructores
    public Triangulo(){
        
    }
    
    public Triangulo( int l1, int l2, int l3){
        this.lado1 = l1 ;
        this.lado2 = l2 ;
        this.lado3 = l3 ;
    }

    /**
     * @return the lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    /**
     * Comprueba si los 3 dados forman un triangulo.
     * @return Devuelve verdadero si es cierto.
     */
    public boolean comprobarTriangulo(){
        boolean valido = true ;
        if( (this.getLado1() + this.getLado2() <= this.getLado3() ) ){
            valido = false ;
        }else{
            if( (this.getLado1() + this.getLado3() <= this.getLado2() ) ){
                valido = false ;
            }else{
                if( (this.getLado2() + this.getLado3() <= this.getLado1() ) ){
                    valido = false ;
                }
            }
        }
        return valido ;
    }
    
    /**
     * Calcula el perimetro del Triangulo.
     * @return 
     */
    public int obtenerPerimetro(){
        return this.getLado1() + this.getLado2() + this.getLado3() ;
    }
}
