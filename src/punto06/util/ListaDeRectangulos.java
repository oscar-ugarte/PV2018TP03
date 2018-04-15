/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto06.util;

import java.util.ArrayList;
import punto06.dominio.Punto;
import punto06.dominio.Rectangulo;

/**
 *
 * @author Lenovo
 */
public class ListaDeRectangulos {
    private ArrayList<Rectangulo> rectangulos = new ArrayList();

    //Constructor
    public ListaDeRectangulos() {
        this.rectangulos.add( new Rectangulo(8, 12, new Punto(4,8)) ) ;
        this.rectangulos.add( new Rectangulo(3, 9, new Punto(5,10)) ) ;
        this.rectangulos.add( new Rectangulo(15, 2, new Punto(1,6)) ) ;
        this.rectangulos.add( new Rectangulo(11, 16, new Punto(2,5)) ) ;
        this.rectangulos.add( new Rectangulo(4, 10, new Punto(9,2)) ) ;        
    }

    /**
     * @return the rectangulos
     */
    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }
    
    /**
     * Mustra los elementos de la lista uno debajo del otro.
     */
    public void mostrarLista(){
        for(Rectangulo rectangulo : this.getRectangulos()){
            rectangulo.obtenerPunto2();
            System.out.println("Base: " + rectangulo.getBase());
            System.out.println("Altura: " + rectangulo.getAltura());
            System.out.println("Perimetro: " + rectangulo.obtenerPerimetro());
            System.out.println("Superficie: " + rectangulo.obtenerSuperficie() );
            System.out.println("------------------------------------");
        }
    }

    /**
     * Muestra los elementos en una tabla improvisada.
     */
    public void mostrarTabla(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Eje X  | Eje Y  | Base | Altura | Perimetro | Superficie |  ");
        for(Rectangulo rectangulo : this.getRectangulos()){
            System.out.print("    " + rectangulo.getPuntoDelRectangulo().getPosicionX() + "    " );
            System.out.print("    " + rectangulo.getPuntoDelRectangulo().getPosicionY() + "  " );
            System.out.print("      " + rectangulo.getBase() + "    ");
            System.out.print("  " + rectangulo.getAltura() + "    ");
            System.out.print("    " + rectangulo.obtenerPerimetro()+ "   ");
            System.out.print("       " + rectangulo.obtenerSuperficie() + " ");
            System.out.println("");
            System.out.println("-------------------------------------------------------------");
            
        }
    }    
    
}
