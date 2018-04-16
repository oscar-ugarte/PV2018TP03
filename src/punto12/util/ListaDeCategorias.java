package punto12.util;

import java.util.ArrayList;
import punto12.dominio.Categoria;

public class ListaDeCategorias {
    private ArrayList<Categoria> categorias = new ArrayList() ;
    
    //Constructores
    public ListaDeCategorias() {
        categorias.add(new Categoria(1,"Aventura") ) ;
        categorias.add(new Categoria(2,"Biografica") ) ;
        categorias.add(new Categoria(3,"Ciencia Ficcion") );
        categorias.add(new Categoria(4,"Drama") ) ;
        categorias.add(new Categoria(5,"Fantasia") ) ;
        categorias.add(new Categoria(6,"Ficcion") );
        categorias.add(new Categoria(7,"Lirica") ) ;
        categorias.add(new Categoria(8,"Misterio") ) ;
        categorias.add(new Categoria(9,"Policial") ) ;
        categorias.add(new Categoria(10,"Romance") ) ;
        categorias.add(new Categoria(11,"Terror") ) ;        
    }

    /**
     * @return the categorias
     */
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias the categorias to set
     */
    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    /**
     * Muestra una tabla con la posicion de todas las categorias cargadas.
     */
    public void mostrarTodasLasCategorias(){
        System.out.println("--------------------------------");
        System.out.println("| Orden |      Categoria        |");
        for(Categoria unaCategoria : categorias ){
            System.out.print(" " + unaCategoria.getNumero() );
            System.out.print("    " + unaCategoria.getContenido() );
            System.out.println("");
            System.out.println("--------------------------------");
        }
    }
    
    /**
     * Recibe un entero que indica la posicion de la categoria que se quiere
     * obtener.
     * @param posicion
     * @return Regresa un objeto categoria.
     */
    public Categoria elegirCategoria(int posicion){
        posicion = posicion - 1 ;
        return this.getCategorias().get(posicion) ;
    }
}
