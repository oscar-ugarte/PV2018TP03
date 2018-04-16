package punto11.util;

import java.util.ArrayList;
import punto11.dominio.Zapatilla;


public class ListaDeZapatillas {
    private ArrayList<Zapatilla> zapatillas = new ArrayList();

    public ListaDeZapatillas() {
    }

    /**
     * @return the zapatillas
     */
    public ArrayList<Zapatilla> getZapatillas() {
        return zapatillas;
    }

    /**
     * @param zapatillas the zapatillas to set
     */
    public void setZapatillas(ArrayList<Zapatilla> zapatillas) {
        this.zapatillas = zapatillas;
    }

    /**
     * Agrega un zapatilla a la lista.
     * @param zapatilla 
     */
    public void cargarUnaZapatilla(Zapatilla zapatilla){
        this.zapatillas.add(zapatilla) ;
    }
    
    /**
     * Muestra el listado de zapatilla
     */
    public void listarZapatilas(){
        for(Zapatilla unaZapatilla : zapatillas){
            System.out.println("Marca de Zapatilla: " + unaZapatilla.getMarca());
            System.out.println("Tipo : " + unaZapatilla.getTipo() );
            System.out.println("");
        }
    }
}
