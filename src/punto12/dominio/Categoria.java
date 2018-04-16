package punto12.dominio;

public class Categoria {
    private int numero ;
    private String contenido ;
    
    //Constructor
    public Categoria() {
    }

    public Categoria(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}
