package punto01.inicio;

import java.util.Scanner;
import punto01.dominio.Punto;

public class Principal {
     public static void main(String[] args) {
    int x, y ;
        Scanner teclado = new Scanner(System.in) ;
        Punto punto1 = new Punto(7,5);
        Punto punto2 = new Punto();
        
        System.out.print("Ingrese valor de X: ");
        x = teclado.nextInt() ;
        System.out.print("Ingrese valor de Y: ");
        y = teclado.nextInt() ;
        punto2.setPosicionX(x) ;
        punto2.setPosicionY(y) ;
        
        System.out.println("Distancia entre el punto 1 y 2 : " + punto1.obtenerDistanciaEntrePuntos(punto2));
}
}
