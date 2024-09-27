package mx.unam.fi.poo.g1.p2; 
import mx.unam.fi.poo.g1.p2.*;

/**
 * Clase principal de la Práctica 2
 * @author Yahir Barojas Morales
 * @version Septiembre-2024
 */

public class Practica2{

    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     * 
     */
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        triangulo.setFilas(5);
        
        System.out.println("\nTriangulo de Pascal formado con n: " + triangulo.getFilas());
        triangulo.crearTriangulo();

        triangulo.setFilas(7);
        System.out.println("\nTriangulo de Pascal formado con n: " + triangulo.getFilas());
        triangulo.crearTriangulo();


    }
}