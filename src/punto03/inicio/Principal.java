/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto03.inicio;

import java.util.Scanner;
import punto03.dominio.Triangulo;

/**
 *
 * @author LIGA
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in) ;
        //Triangulo unTriangulo = new Triangulo(7,10,5);
        Triangulo unTriangulo = new Triangulo();
        System.out.print("Ingrese lado A: ");
        unTriangulo.setLado1(teclado.nextInt());
        System.out.print("Ingrese lado B: ");
        unTriangulo.setLado2(teclado.nextInt());        
        System.out.print("Ingrese lado C: ");
        unTriangulo.setLado3(teclado.nextInt());
        
        if(unTriangulo.comprobarTriangulo() ){
            System.out.println("Valido.");
            System.out.println("El perimetro es : " + unTriangulo.obtenerPerimetro() );
        }else{
            System.out.println("Invalido.");
        }
    }
}
