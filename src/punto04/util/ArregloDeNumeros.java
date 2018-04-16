/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto04.util;

import java.util.Scanner;

/**
 *
 * @author LIGA
 */
public class ArregloDeNumeros {
    private int[] arreglo ;
    
    //Constructores
    public ArregloDeNumeros(){
        arreglo = new int[10]; //El Arreglo tendra 10 posiciones
    }
    
    public ArregloDeNumeros(int[] numeros){
         this.arreglo = numeros ;
    }
    
    public ArregloDeNumeros(int tamanioDelArreglo){
        arreglo = new int[tamanioDelArreglo] ;
    }
    
    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    /**
     * Permite cargar por completo el arreglo con numeros.
     */
    public void cargarArreglo(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0 ; i <= this.getArreglo().length - 1 ; i++){
            System.out.print("Ingrese un numero: ");
            this.getArreglo()[i] = teclado.nextInt() ;
        }
    }
    
    /**
     * Muestra el arreglo de numeros por pantalla.
     */
    public void mostrarArreglo(){
         for(int i = 0 ; i <= this.getArreglo().length - 1 ; i++){
             System.out.println("Posicion " + i + " :" + this.getArreglo()[i] );
         }
     }
     
    /**
     * Permite obtener el promedio de los numeros.
     * @return Retorna un numero decimal que contiene el promedio.
     */
     public double obtenerPromedio(){
         double promedio = 0;
         for(int i = 0 ; i <= this.getArreglo().length - 1 ; i++){
             promedio = promedio + this.getArreglo()[i] ;
         }
         return promedio / this.getArreglo().length;
     }
     
     /**
      * Obtiene el mayor numero del arreglo.
      * @return 
      */
     public int obtenerMayor(){
         int mayor = this.getArreglo()[0] ;
         for(int i = 0 ; i <= this.getArreglo().length - 1 ; i++){
             if(mayor < this.getArreglo()[i] ){
                 mayor = this.getArreglo()[i] ;
             }
         }
         return mayor ;
     }
     
     /**
      * Obtiene el menor numero del arreglo.
      * @return 
      */
     public int obtenerMenor(){
         int menor = this.getArreglo()[0] ;
         for(int i = 0 ; i <= this.getArreglo().length - 1 ; i++){
             if(menor > this.getArreglo()[i] ){
                 menor = this.getArreglo()[i] ;
             }
         }
         return menor ;
     }     
}
