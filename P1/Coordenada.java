package mx.unam.fi.poo.g1.p1;

/**
 * Clase Coordenada
 * @author Yahir Barojas Morales
 * @version Septiembre-2024
 * 
 */

public class Coordenada{
    private double x1,y1,x2,y2;
    private double radio = 6371.01;

    /**
     * Método Constructor vacío
     * Para construir objetos Coordenada
     */
    public Coordenada(){}

    /**
     * Método Constructor 
     * Para construir objetos Coordenada
     * @param x1 -> Atributo para x1 de coordenada
     * @param y1 -> Atributo para y1 de coordenada
     * @param x2 -> Atributo para x2 de coordenada
     * @param y2 -> Atributo para y2 de coordenada
     */
    public Coordenada(double x1, double y1, double x2, double y2){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    /**
     * Método get
     * @return x2 -> Regresa el atributo x1
     */
    public double getX1(){
        return x1;
    }

    /**
     * Método set
     * @param x1 -> Para cambiar el dato de x1 de coordenada
     */
    public void setX1(double x1){
        this.x1 = x1;
    }

    /**
     * Método get
     * @return y1 -> Regresa el atributo y1
     */
    public double getY1(){
        return y1;
    }

    /**
     * Método set 
     * @param y1 -> Para cambiar el dato de y1 de coordenada
     */
    public void setY1(double y1){
        this.y1 = y1;
    }

    /**
     * Método get 
     * @return x2 -> Regresa el atributo x2
     */
    public double getX2(){
        return x2;
    }

    /**
     * Método set
     * @param x2 -> Para cambiar el dato de x2 de coordenada
     */
    public void setX2(double x2){
        this.x2 = x2;
    }

    /**
     * Método get 
     * @return y2 -> Regresa el atributo y2
     */
    public double getY2(){
        return y2;
    }

    /**
     * Método set 
     * @param y2 -> Para cambiar el dato de y2 de coordenada
     */
    public void setY2(double y2){
        this.y2 = y2;
    }
    
    /**
     * Método get
     * @return radio -> Regresa el atributo radio
     */
    public double getRadio(){
        return radio;
    }

    /**
     * Método set
     * @param radio -> Para cambiar el dato de radio de coordenada
     */
    public void setRadio(double radio){
        this.radio = radio;
    }

    /**
     * Método para calcular la distancia entre los puntos (x1,y1) y (x2,y2)
     * @return distancia entre puntos 
     */
    public double distanciaPuntos(){
        return (radio * Math.acos( Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1)));
    }
    



}