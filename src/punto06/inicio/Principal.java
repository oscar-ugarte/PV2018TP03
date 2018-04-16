/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto06.inicio;

import java.util.Scanner;
import punto06.util.ListaDeRectangulos;

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
        int posicion ;
        ListaDeRectangulos lista = new ListaDeRectangulos();
        //lista.mostrarLista(); //Muestra los elementos uno abajo del otro.
        lista.mostrarTabla(); //Muestra una tabla. 
   
        System.out.println("Hay " +  lista.getRectangulos().size() + " elementos en la lista:" );
        System.out.print("¿Cual eliminara?  ");
        posicion = teclado.nextInt() ; //Ingresa la posicion a eliminar
        if( posicion <= lista.getRectangulos().size() ){
            lista.getRectangulos().remove(posicion - 1);
            lista.mostrarTabla();             
        }else{
            System.out.println("Posicion invalida.");
        }
       
    }
    
    
}
