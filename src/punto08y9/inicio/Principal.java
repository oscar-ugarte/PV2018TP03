package punto08y9.inicio;

import java.util.Scanner;
import punto08y9.util.ListaDeLibros;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaDeLibros libros = new ListaDeLibros();
        int cantidad ;
        String titulo ;
        //Cargando libros
        System.out.print("¿Cuantos libros cargara? ");
        cantidad = teclado.nextInt() ;
        for(int i = 1 ; i <= cantidad ; i++){
            libros.ingresarDatosLibro();
        }
        
        teclado.nextLine() ; //Para que no se salte.
        System.out.print("Ingrese el titulo a buscar: ");
        titulo = teclado.nextLine() ;
        libros.buscarLibrosPorTitulo(titulo);
    }
    
}
