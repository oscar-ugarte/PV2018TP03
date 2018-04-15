/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.inicio;

import java.util.Scanner;
import punto10.dominio.Producto;
import punto10.util.ListaDeCuotas;

/**
 *
 * @author Lenovo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Producto unProducto = new Producto(1020, "Cafetera Express",2250);
        ListaDeCuotas cuotas = new ListaDeCuotas();
        int numeroDeCuotas ;
        System.out.print("¿En cuantas cuotas va a sacar el producto? ");
        numeroDeCuotas = teclado.nextInt() ;
        //cuotas.obtenerTablaDeCuotas(numeroDeCuotas, unProducto); // Los 2 metodos siguiente equivalen a este.
        cuotas.cargarListaDeCuotas(numeroDeCuotas, unProducto);
        cuotas.mostrarTablaDeCuotas(unProducto);
    }
    
    
}
