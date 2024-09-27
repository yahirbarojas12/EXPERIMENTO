package mx.unam.fi.poo.g1.p4;

/**
 * Clase CuentaBanco
 * @author Yahir Barojas Morales 
 * @version Septiembre-2024
 * 
 */
public class CuentaBanco{
    private String nombre;
    private String cuenta;
    private double depositoInicial;

    /**
     * Método Constructor vacío
     * Para crear objetos CuentaBanco
     */
    public CuentaBanco(){}
    
    /**
     * Método Constructor
     * Para construir objetos CuentaBanco
     * @param nombre -> Atributo para el nombre de usuario
     * @param cuenta -> Atributo para la cuenta de usuario
     * @param depositoInicial -> Atributo para el deposito inicial de usuario
     */
    public CuentaBanco(String nombre, String cuenta, double depositoInicial){
        setNombre(nombre);
        setCuenta(cuenta);
        setDepositoInicial(depositoInicial);
    }

    /**
     * Método get
     * @return nombre -> Regresa el atributo nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método set
     * @param nombre -> Para cambiar el dato de nombre de usuario
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método get
     * @return cuenta -> Regresa el atibuto cuenta
     */
    public String getCuenta(){
        return cuenta;
    }

    /**
     * Método set
     * @param cuenta -> Para cambiar el dato de cuenta de usuario
     */
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    
    /**
     * Método get
     * @return depositoInicial -> Regresa el deposito inicial de usuario
     */
    public double getDepositoInicial(){
        return depositoInicial;
    }

    /**
     * Método set 
     * @param depositoInicial -> Para cambiar el dato de depósito incial de usuario
     */
    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
    }

    /**
     * Método para depositar dinero
     * @param cantidad -> Cantidad del usuario depositada
     */
    public void depositar(double cantidad) {
        depositoInicial = depositoInicial + cantidad;
    }

    /**
     * Método para retirar dinero del atributo depósito inicial
     * @param cantidad -> Cantidad a retirar de usuario
     */
    public void retirarDinero(double cantidad) {
        if(depositoInicial >= cantidad){
            depositoInicial = depositoInicial - cantidad;
        }else{
            System.out.println("Fondos insuficientes...");
        }
    }

    /**
     * Método para imprimir información del usuario
     * Muestra el nombre, cuenta y depósito incial
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Cantidad de dinero: "+ depositoInicial);

    }
}