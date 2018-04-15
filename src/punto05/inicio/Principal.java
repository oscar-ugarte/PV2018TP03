/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto05.inicio;

import java.util.Scanner;
import punto05.dominio.Circulo;
import punto05.util.ArregloDeCirculos;

/**
 *
 * @author Lenovo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in) ;
        ArregloDeCirculos circulos = new ArregloDeCirculos(3); // Crea un arreglo de 3 elementos.
        double radio ;
        //Cargando el arreglo
        for(int i = 1 ; i <= 3 ; i++){
            System.out.print("Ingrese radio: ");
            radio = teclado.nextDouble() ;
            circulos.agregarUnCirculo( new Circulo(radio) );
        }
        
        //Mostrando Arreglo.
        System.out.println("");
        circulos.mostrarArreglo();
    }
    }
   
