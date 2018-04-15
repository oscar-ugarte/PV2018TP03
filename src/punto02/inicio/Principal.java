/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.inicio;

import java.util.Scanner;
import punto02.dominio.Punto;
import punto02.dominio.Rectangulo;

/**
 *
 * @author LIGA
 */
public class Principal {
    public static void main(String[] args) {
        int altura, base, x, y ;
        Scanner teclado = new Scanner(System.in) ;
        //Rectangulo unRectangulo = new Rectangulo() ;
        
        System.out.print("Ingrese altura: ");
        altura = teclado.nextInt() ;
        System.out.print("Ingrese la base: ");
        base = teclado.nextInt() ;
        System.out.print("Ingrese valor de X del punto: ");
        x = teclado.nextInt() ;
        System.out.print("Ingrese valor de Y del punto: ");
        y = teclado.nextInt() ;
        Rectangulo unRectangulo = new Rectangulo(base, altura, new Punto(x,y));
        
        System.out.println("Perimetro del rectangulo: " + unRectangulo.obtenerPerimetro());
        System.out.println("Superficie del rectangulo: " + unRectangulo.obtenerSuperficie());
        unRectangulo.obtenerOtrosPunto();
    }
}
