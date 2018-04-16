package punto08y9.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto08y9.dominio.Libro;

public class ListaDeLibros {
    private ArrayList<Libro> libros = new ArrayList() ;

    public ListaDeLibros() {
        this.libros.add(new Libro( "9505816286", "El Visitante", "Alma Maritano", 200.0 ) ); // Ya cargamos un libro para pruebas.
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    /**
     * Agrega un libro a la lista.
     * @param unLibro 
     */
    public void agregarUnLibro(Libro unLibro ){
        this.libros.add(unLibro) ;
        visualizarTablaDeLibros();
    }
    
    /**
     * Muestra el contenido de la lista como una tabla.
     */
    public void visualizarTablaDeLibros(){
           System.out.println("------------------------------------------------------------------------------------");
           System.out.println("|    ISBN       |           Titulo            |       Autor       |   Precio U.   |"); 
       for(Libro libro : libros){ 
           System.out.print("  " + libro.getIsbn() + "       "  );
           System.out.print("  " + libro.getTitulo() + "        " );
           System.out.print("  " + libro.getAutor() + "       " ) ;
           System.out.print("  " + libro.getPrecio() );
           System.out.println(""); 
           System.out.println("|               |                             |                   |               |");
       } 
    }
    
    /**
     * Recibe un titulo por parametros y revisa si se encuentra en la lista.
     * @param titulo 
     */
    public void buscarLibrosPorTitulo(String titulo){
        for(Libro libro : libros){ 
            //System.out.println("Buscando...");
            if(titulo.equals(libro.getTitulo())){
                System.out.println("Libro Encontrado");
                libro.mostrarDatosLibro();
                break;
            }
        }
    }
    
    /**
     * Ingresa los datos de un libro y luego crea un objeto con ellos y lo agrega a la lista.
     */
    public void ingresarDatosLibro(){
        Scanner teclado = new Scanner(System.in);   
        String isbn, titulo, autor ;
        double precio;
        System.out.println("Cargando datos: ");
        System.out.print("Ingrese ISBN (Entre 10 y 13 caracteres): ");
        isbn = teclado.nextLine();
        System.out.print("Ingrese Titulo: ");
        titulo = teclado.nextLine() ;
        System.out.print("Ingrese Autor: ");
        autor = teclado.nextLine();
        System.out.print("Ingrese Precio: ");
        precio = teclado.nextDouble() ;
        agregarUnLibro(new Libro(isbn , titulo , autor , precio));
    }
    
}
