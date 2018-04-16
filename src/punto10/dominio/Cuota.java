/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.dominio;

/**
 *
 * @author Lenovo
 */
public class Cuota {
    private int numeroDeCuota ;
    private double importe ;
    
    //Constructor
    public Cuota() {
    }

    public Cuota(int numeroDeCuota, double importe) {
        this.numeroDeCuota = numeroDeCuota;
        this.importe = importe;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
