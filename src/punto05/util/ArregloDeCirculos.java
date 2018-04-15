/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto05.util;

import punto05.dominio.Circulo;

/**
 *
 * @author Lenovo
 */
public class ArregloDeCirculos {
    private Circulo[] arreglo;
    private int espacioOcupado;
    
    //Arreglos
    public ArregloDeCirculos() {
        arreglo = new Circulo[20];
        espacioOcupado = 0 ;
    }

    public ArregloDeCirculos(Circulo[] arreglo) {
        this.arreglo = arreglo;
    }
    public ArregloDeCirculos(int tamanio) {
        arreglo = new Circulo[tamanio];
        espacioOcupado = 0 ;
    }

    /**
     * @return the arreglo
     */
    public Circulo[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(Circulo[] arreglo) {
        this.arreglo = arreglo;
    }

    /**
     * @return the espacioOcupado
     */
    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    /**
     * @param espacioOcupado the espacioOcupado to set
     */
    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }
    
    /**
     * Recibe un circulo por parametros y lo carga en el arreglo de circulos.
     * Aumenta en 1 la cantidad de espacios ocupados del arreglo.
     * @param unCirculo 
     */
    public void agregarUnCirculo(Circulo unCirculo){
        this.getArreglo()[ this.getEspacioOcupado() ] = unCirculo ;
        this.getArreglo()[ this.getEspacioOcupado() ].obtenerDatos() ;
        this.setEspacioOcupado( this.getEspacioOcupado() + 1 );
    }
    
    /**
     * Recorre el arreglo hasta que llega a la maxima posicion ocupada.
     */
    public void mostrarArreglo(){
        for(int i = 0 ; i < this.getEspacioOcupado() ; i++){
        System.out.println("Posicion " + i + " :");    
        this.getArreglo()[ i ].obtenerDatos() ;
        }
    }
}
