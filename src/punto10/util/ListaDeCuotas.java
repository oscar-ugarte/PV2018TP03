/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.util;

import java.util.ArrayList;
import punto10.dominio.Cuota;
import punto10.dominio.Producto;

/**
 *
 * @author Lenovo
 */
public class ListaDeCuotas {
    private ArrayList<Cuota> cuotas = new ArrayList() ;
    //Constructores
    public ListaDeCuotas() {
    
    }

    /**
     * @return the cuotas
     */
    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    /**
     * Primero usa la cantidad de cuotas y el precio del producto para llenar la lista de cuotas
     * y obtener el total de la suma de cuotas.
     * Despues muestra el contenido del producto, una tabla con las cuotas y el total.
     * @param cantidad
     * @param unProducto 
     */
    public void obtenerTablaDeCuotas(int cantidad, Producto unProducto){
        double precioBase = unProducto.getPrecio() / cantidad ;
        double total = 0 ;
        for(int i = 1 ; i <= cantidad ; i++){
            precioBase = precioBase * 1.015 ;
            total = total + precioBase ;
            this.cuotas.add(new Cuota(i, precioBase ) );
        }
        unProducto.mostrarDatos();
        System.out.println("----------------------------");
        System.out.println("|  Cuota   |   Importe     |");
        for(Cuota unaCuota : cuotas){
            System.out.print(  "    " + unaCuota.getNumeroDeCuota() + "    "  );
            System.out.print("   $ " + unaCuota.getImporte() );
            System.out.println("");
            System.out.println("|--------------------------|");
        }
        System.out.println("TOTAL: " + total);
    }
    
    /**
     * Carga la lista de cuotas para un producto recibiendo la cantidad de cuotas
     * y el producto con su precio.
     * @param cantidad
     * @param unProducto 
     */
    public void cargarListaDeCuotas(int cantidad, Producto unProducto){
        double precioBase = unProducto.getPrecio() / cantidad ;
        for(int i = 1 ; i <= cantidad ; i++){
            precioBase = precioBase * 1.015 ;
            this.cuotas.add(new Cuota(i, precioBase ) );
        }        
    }
    
    /**
     * Se encarga de mostrar los datos del producto, la tabla de cuotas y el 
     * total final que se pagara.
     * @param unProducto 
     */
    public void mostrarTablaDeCuotas(Producto unProducto){
        double total = 0 ;
        unProducto.mostrarDatos();
        System.out.println("----------------------------");
        System.out.println("|  Cuota   |   Importe     |");
        for(Cuota unaCuota : cuotas){
            total = total + unaCuota.getImporte();
            System.out.print(  "    " + unaCuota.getNumeroDeCuota() + "    "  );
            System.out.print("   $ " + unaCuota.getImporte() );
            System.out.println("");
            System.out.println("|--------------------------|");
        }
        System.out.println("TOTAL: " + total);    
    }
    
    
}
