package punto11.dominio;

public class Zapatilla {
    private String marca ;
    private String tipo ;

    //Constructores
    public Zapatilla() {
    }

    public Zapatilla(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
