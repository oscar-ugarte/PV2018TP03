/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.inicio;

import java.util.Scanner;
import punto07.util.ListaDeAutos;

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
        String patente ;
        int posicion ;
        Scanner teclado = new Scanner(System.in) ;
        ListaDeAutos listaAutos = new ListaDeAutos();
        
        listaAutos.obtenerDatosEnTabla(); //Muestra una tabla
        
        //listaAutos.mostrarListaAuto(); //Muestra los elementos uno abajo del otro
        
        //Buscando por Patente
        System.out.println("Buscar por patente y modificar ");
        System.out.print("Ingrese la patente: ");
        patente = teclado.nextLine();
        listaAutos.buscarPorPatenteYEditar(patente);
        listaAutos.obtenerDatosEnTabla(); //Muestra una tabla
        
        //Buscando por posicion
        System.out.println("Editar un elemento por el orden");
        System.out.print("Ingrese la posicion: ");
        posicion = teclado.nextInt() ;
        listaAutos.editarPorOrden(posicion); //Se le resta 1 porque comienza desde 0
        listaAutos.obtenerDatosEnTabla(); //Muestra una tabla
        
    }
       
}
