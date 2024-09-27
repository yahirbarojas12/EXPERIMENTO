package mx.unam.fi.poo.g1.p1;
import mx.unam.fi.poo.g1.p1.*;

/**
 * Clase principal de la Práctica 1
 * @author Yahir Barojas Morales
 * @version Septiembre-2024
 * 
 */

public class Practica1{
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        c1.setX1(35);
        c1.setY1(40);
        c1.setX2(15);
        c1.setY2(25);
        
        System.out.println("\nLa distancia entre los puntos es: " + c1.distanciaPuntos() + " km");
        
    }
}