/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto05.dominio;

/**
 *
 * @author Lenovo
 */
public class Circulo {
    private double radio ;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Obtiene la superficie del circulo.
     * @return 
     */
    public double obtenerSuperficie(){
        return Math.PI * Math.pow(radio, 2);
    }    
    
    /**
     * Muestra el radio y la superficie del circulo.
     */
    public void obtenerDatos(){
        System.out.println("Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.obtenerSuperficie());
    }
}
