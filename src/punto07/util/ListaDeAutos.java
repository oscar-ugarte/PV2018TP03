/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto07.dominio.Auto;

/**
 *
 * @author Lenovo
 */
public class ListaDeAutos {
    private ArrayList<Auto> autos = new ArrayList() ;
    
    //Constructor
    public ListaDeAutos() {
        this.autos.add( new Auto("WEG 260", "Nissan", "Kicks", "Gris plateado", "Diesel") );
        this.autos.add( new Auto("PEG 120", "Nissan", "Frontier", "Naranja", "Diesel") );
        this.autos.add( new Auto("GIO 230", "Nissan", "March", "Azul Oscuro", "Gasolina") );
        this.autos.add( new Auto("GTO 130", "Toyota", "Yaris", "Rojo Oscuro", "Diesel") );
        this.autos.add( new Auto("OCU 290", "Toyota", "Corolla", "Blanco", "Gasolina") );
    }

    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    
    /**
     * Muestra los elementos de la lista uno abajo del otro.
     */
    public void mostrarListaAuto(){
        for(Auto unAuto : autos){
            System.out.println("Patente: " + unAuto.getPatente() );
            System.out.println("Marca: " + unAuto.getMarca() );
            System.out.println("Modelo: " + unAuto.getModelo() );
            System.out.println("Color: " + unAuto.getColor() );
            System.out.println("Tipo de Combustible: " + unAuto.getCombustible());
            System.out.println("");
        }
    }
    
    /**
     * Carga los datos de un auto y lo regresa.
     * @return 
     */
    public Auto cargarNuevosDatos(){
        Scanner teclado = new Scanner(System.in) ;
        String patente, marca, modelo, color, combustible ;
        System.out.print("Ingrese nueva patente: ");
        patente = teclado.nextLine();
        System.out.print("Ingrese nueva marca: ");
        marca =  teclado.nextLine();
        System.out.print("Ingrese nuevo modelo: ");
        modelo = teclado.nextLine();
        System.out.print("Ingrese nuevo color: ");
        color = teclado.nextLine();
        System.out.print("Ingrese nuevo tipo de combustible: ");
        combustible = teclado.nextLine();
        return  new Auto(patente, marca, modelo, color, combustible) ;
    }
    
    /**
     * Realiza una busqueda por numero de patente y permite editar el auto.
     * @param patente 
     */
    public void buscarPorPatenteYEditar(String patente){
        int i = 0 ; // para llevar
        for(Auto unAuto : autos){
            if( patente.equals(unAuto.getPatente() ) ) {
                autos.set(i, this.cargarNuevosDatos() ) ;
                break; //Para detener el ciclo.
            }
            i++;    
        }
    }
    
    /**
     * El usuario realiza una modificacion por medio de la posicion pasada por parametro.
     * @param posicion 
     */
    public void editarPorOrden(int posicion){
        autos.set(posicion - 1, this.cargarNuevosDatos() ) ; //Se le resta 1 a las posiciones
    }
    
    public void obtenerDatosEnTabla(){
        int pos = 1 ; 
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|P| Patente | Marca |  Modelo  |   Color   |  Combustible  |");
        for(Auto unAuto : autos){
            System.out.print(" " + pos + " ");
            System.out.print(" " + unAuto.getPatente() + " ");
            System.out.print(" " + unAuto.getMarca() + " ");
            System.out.print(" " + unAuto.getModelo() + " ");
            System.out.print("     " + unAuto.getColor() + " ");
            System.out.print(" " + unAuto.getCombustible());
            System.out.println("");
            System.out.println("-------------------------------------------------------------------");
            pos++; //Aumenta
        }
        
    }
}
