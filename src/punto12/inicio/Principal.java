package punto12.inicio;

import java.util.Scanner;
import punto12.util.ListaDeLibros;
import punto12.util.ListaDeCategorias;

public class Principal {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in) ;
            ListaDeCategorias categorias = new ListaDeCategorias() ;
            ListaDeLibros libros = new ListaDeLibros() ;
            int cantidad, opcion, campo2 ;
            String campo1 ;

            System.out.print("Ingrese la cantidad de libros:  ");
            cantidad = teclado.nextInt() ;
            for(int i = 1 ; i <= cantidad ; i++){
                libros.cargarDatosLibro();
            }
            
            libros.obtenerDatosListaDeLibros();
            teclado.nextLine(); // Para evitar que se salte la lectura.
            
            do{
                opcion = libros.menu() ; //Funciona recien en la segunda
                switch(opcion){
                case 1:
                    //teclado.nextLine();
                    System.out.print("Ingrese el titulo para buscar: ");
                    campo1 = teclado.nextLine() ;
                    libros.buscarPorTitulo(campo1);
                    break;
                case 2:
                    //teclado.nextLine();
                    System.out.print("Ingrese el Autor para buscar: ");
                    campo1 = teclado.nextLine();
                    libros.buscarPorAutor(campo1);
                    break;
                case 3:
                    //teclado.nextLine();
                    System.out.println("Ingrese el numero correspondiente a la categoria: ");
                    categorias.mostrarTodasLasCategorias();
                    System.out.print("Ingrese numero de categoria: ");
                    campo2 = teclado.nextInt() ;
                    libros.buscarPorCategoria( categorias.elegirCategoria(campo2).getContenido() );
                    teclado.nextLine(); //Para evitar que se salte.
                    break;
                case 4:    
                    // teclado.nextLine(); // Para evitar que se salte
                    System.out.print("Ingrese el titulo para buscar: ");
                    campo1 = teclado.nextLine() ;
                
                    System.out.print("Ingrese el numero correspondiente a la categoria: ");
                    categorias.mostrarTodasLasCategorias();
                    System.out.print("Ingrese numero de categoria: ");
                    campo2 = teclado.nextInt() ;                
                    teclado.nextLine(); // Para evitar que se salte
                    libros.buscarPorTituloYCategoria(campo1, categorias.elegirCategoria(campo2).getContenido() );
                    break;
                }
                System.out.println("");
                System.out.print("Apriete enter para continuar...");
                teclado.nextLine() ;
        }while(opcion != 5) ;
            
    }      
}
