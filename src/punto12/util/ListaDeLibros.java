package punto12.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto12.dominio.Categoria;
import punto12.dominio.Libro;

public class ListaDeLibros {
    private ArrayList<Libro> libros = new ArrayList() ;

    //Constructores
    public ListaDeLibros() {
        libros.add(new Libro ( "9505810679", "El Visitante", "Alma Maritano", new Categoria(6, "Ficcion") ,200 ) ) ; //Se carga un libro para pruebas
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
     * Agrega un libro pasado por parametros a la lista.
     * @param libro 
     */
    public void agregarLibro(Libro libro){
        this.libros.add(libro) ;
    }

    /**
     * Carga todos los campos de un libro y luego lo agrega a la lista de libros.
     */
    public void cargarDatosLibro(){
        String isbn, titulo, autor ;
        double precio ;
        int categoria ;
        ListaDeCategorias categorias = new ListaDeCategorias() ;
        Scanner teclado = new Scanner(System.in) ;
        System.out.print("Ingrese ISBN (Entre 10 y 13 caracteres) : ");
        isbn = teclado.nextLine();
        System.out.print("Ingrese titulo: ");
        titulo = teclado.nextLine() ;
        System.out.print("Ingrese Autor: ");
        autor = teclado.nextLine();
        System.out.println("Mostrando Categorias Disponibles: ");
        categorias.mostrarTodasLasCategorias();
        System.out.print("Ingrese el numero correspondiente a la categoria: ");
        categoria = teclado.nextInt() ;
        System.out.print("Ingrese precio : ");
        precio = teclado.nextDouble() ;
        
        agregarLibro(new Libro ( isbn, titulo, autor, categorias.elegirCategoria(categoria), precio  )  );
        System.out.println("------------------");
    }
    
    /**
     * Obtiene los datos de cada libro cargado
     */
    public void obtenerDatosListaDeLibros(){
        for(Libro unlibro : libros){
            System.out.println("");
            unlibro.mostrarDatosLibro();
            System.out.println("");
        }        
    }
    
    /**
     * Muestra las opciones para realizar busques y retorna el numero de opcion
     * escogida.
     * @return 
     */
    public int menu(){
        Scanner teclado = new Scanner(System.in) ;
        int op ;
        System.out.println("*****Menu*****");
        System.out.println("1) Buscar por Titulo.");
        System.out.println("2) Buscar por Autor.");
        System.out.println("3) Categoria.");
        System.out.println("4) Buscar por Titulo y Categoria.");
        System.out.println("5) Salir.");
        System.out.print("Elija una opcion para buscar libros:   ");
        op = teclado.nextInt() ;
        return op ;
    }
    
    /**
     * Busca un libro por el titulo.
     * @param titulo 
     */
    public void buscarPorTitulo(String titulo){
        for(Libro unlibro : libros){
            if(titulo.equals(unlibro.getTitulo() )){
                System.out.println("");
                System.out.println("-----Libro Encontrado-----");
                unlibro.mostrarDatosLibro();
                break ; // Para detener el ciclo for
            }
        }
    }
    
    /**
     * Busca un libro por el autor.
     * @param autor 
     */
    public void buscarPorAutor(String autor){
        for(Libro unlibro : libros){
            if(autor.equals(unlibro.getAutor() )){
                System.out.println("");
                System.out.println("-----Libro Encontrado-----");
                unlibro.mostrarDatosLibro();
                //break ; // Para detener el ciclo for
            }
        }
    }
    
    /**
     * Busca y muestra todos los de una categoria.
     * @param categoria 
     */
    public void buscarPorCategoria(String categoria){
        for(Libro unlibro : libros){
            if(categoria.equals(unlibro.getCategoria().getContenido() )){
                System.out.println("");
                System.out.println("-----Libro Encontrado-----");
                unlibro.mostrarDatosLibro();
                //break ; // Para detener el ciclo for
            }
        }
    }
    
    /**
     * Busca un libro que coincida con el titulo y la categoria.
     * @param titulo
     * @param categoria 
     */
    public void buscarPorTituloYCategoria(String titulo, String categoria){
        for(Libro unlibro : libros){
            if( titulo.equals(unlibro.getTitulo()) && categoria.equals( unlibro.getCategoria().getContenido()  )) {
                System.out.println("");
                System.out.println("-----Libro Encontrado-----");
                unlibro.mostrarDatosLibro();
                break ; // Para detener el ciclo for
            }
        }
    }
    
}
