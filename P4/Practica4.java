package mx.unam.fi.poo.g1.p4;
import mx.unam.fi.poo.g1.p4.*;

/**
 * Clase principal de la Práctica 4
 * @author Yahir Barojas Morales 
 * @version Septiembre-2024
 * 
 */

public class Practica4{
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplciación
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {

        CuentaBanco c1 = new CuentaBanco("Laura Mendieta", "42556712", 10000);
        CuentaBanco c2 = new CuentaBanco("Julio Salinas" , "67532321", 8500);;

        System.out.println("\nDetalles de las cuentas: ");
        c1.imprimirInformacion();
        System.out.println();
        c2.imprimirInformacion();

        c1.retirarDinero(100);
        System.out.println("\nSe retiran 100 de la cuenta de " + c1.getNombre());
        System.out.println("Saldo nuevo: " + c1.getDepositoInicial());
        System.out.println("Se intentan retirar 9000 de la cuenta de " + c2.getNombre());
        c2.retirarDinero(9000);
        System.out.println("Saldo actual: " + c2.getDepositoInicial());
        c1.depositar(1000);
        System.out.println("Se depostitan 1000 de la cuenta de " + c1.getNombre());
        System.out.println("Saldo nuevo: " + c1.getDepositoInicial());
        System.out.println("\nDetalles después de efectuar movimientos bancarios:");

        c1.imprimirInformacion();
        System.out.println();
        c2.imprimirInformacion();
        
    }
}