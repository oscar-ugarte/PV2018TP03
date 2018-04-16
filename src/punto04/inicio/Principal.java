/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto04.inicio;

import punto04.util.ArregloDeNumeros;

/**
 *
 * @author LIGA
 */
public class Principal {
    public static void main(String[] args) {
        ArregloDeNumeros unArreglo = new ArregloDeNumeros(12); //Se crea un arreglo de 12 posiciones.
        unArreglo.cargarArreglo();
        unArreglo.mostrarArreglo();
        System.out.println("Promedio: " + unArreglo.obtenerPromedio());
        System.out.println("Mayor: " + unArreglo.obtenerMayor());
        System.out.println("Menor: " + unArreglo.obtenerMenor());
    }
}
