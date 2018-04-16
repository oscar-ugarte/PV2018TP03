package punto11.inicio;

import java.util.Scanner;
import punto11.dominio.Zapatilla;
import punto11.util.ListaDeZapatillas;

public class Principal {
    public static void main(String[] args) {
        int cantidadDeZapatillas ;
        String marca, tipo ;
        Scanner teclado = new Scanner(System.in);
        ListaDeZapatillas zapatillas = new ListaDeZapatillas();
        
        System.out.print("¿Cuantas zapatillas cargara? ");
        cantidadDeZapatillas =teclado.nextInt() ;
        
        for(int i = 1 ; i <= cantidadDeZapatillas ; i++){
            System.out.print("Ingrese Marca (Una palabra ): ");
            marca = teclado.next();
            System.out.print("Ingrese Tipo: (Original o Copia): ");
            tipo = teclado.next() ;
            zapatillas.cargarUnaZapatilla(new Zapatilla(marca, tipo));
        }
        System.out.println("Zapatillas Cargadas:");
        zapatillas.listarZapatilas();
    }
}
