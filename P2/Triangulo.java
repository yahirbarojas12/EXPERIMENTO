package mx.unam.fi.poo.g1.p2; 

/**
 * Clase Triangulo
 * @author Yahir Barojas Morales
 * @version Septiembre-2024
 * 
 */
public class Triangulo{
    private int filas;

    /**Método Constructor vacío
     * Para construir objetos Triángulo
     */
    public Triangulo(){}
    /**
     * Método Constructor
     * Para construir objetos Triángulo
     * @param filas -> Atributo para el numero de filas de triangulo
     */
    public Triangulo(int filas){
        setFilas(filas); 
    }

    /**
     * Método get
     * @return filas -> Regresa el atributo filas
     */
    public int getFilas(){
        return filas;
    }

    /**
     * Método set
     * @param filas -> Para cambiar el numero de filas de triangulo
     */
    public void setFilas(int filas){
        this.filas = filas;
    }

    /**
     * Método para imprimir el Triángulo de Pascal con base en el valor de filas
     */
    public void crearTriangulo(){
        int num = 1;
        for(int i = 0; i <= filas; i++){
            for(int e = 1 ; e <= filas-i; e++)
                System.out.print(" ");
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);  
            }
            System.out.println();
            num = 1; 
        }
    }
}