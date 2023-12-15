import java.util.Scanner;

/**
 * @author Ana
 * @version 1.0
 */

public class Singleton {
    private Singleton() {
    }

    /**
     * Numero de intentos maximo
     */
    private int nMax = 2;
    /**
     * Numero aleatorio
     */
    private int numeroAleatorio;
    /**
     * Numero introducido por el usuario
     */
    private int numeroPropuesto;
    /**
     * Adivinaciones correctas
     */
    private int puntuacion;
    /**
     * Nombre del usuario
     */
    private String alias;
    /**
     * Numero de rondas por partida
     */
    private int rondasPartida = 10;
    /**
     * Ronda actual
     */
    private int rondaActual;
    /**
     * Numero de fallos
     */
    private int fallos;

    /**
     *
     * @param numeroAleatorio : Numero aleatorio
     * @param numeroPropuesto : Numero introducido por el usuario
     * @param nMax : Numero maximo de intentos
     * @param puntuacion : Adivinaciones correctas
     * @param alias : Nombre del usuario
     * @param rondasPartida : Numero de rondas por partida
     * @param rondaActual : Ronda actual en la partida
     * @param fallos : Numero de fallos
     */
    public Singleton(int numeroAleatorio, int numeroPropuesto, int nMax, int puntuacion, String alias, int rondasPartida, int rondaActual, int fallos) {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroPropuesto = numeroPropuesto;
        this.nMax = nMax;
        this.puntuacion = puntuacion;
        this.alias = alias;
        this.rondasPartida = rondasPartida;
        this.rondaActual = rondaActual;
        this.fallos = fallos;
    }

    /**
     * Getter
     * @return numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * Setter
     * @param numeroAleatorio
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * Getter
     * @return numeroPropuesto
     */
    public int getNumeroPropuesto() {
        return numeroPropuesto;
    }

    /**
     * Setter
     * @param numeroPropuesto
     */
    public void setNumeroPropuesto(int numeroPropuesto) {
        this.numeroPropuesto = numeroPropuesto;
    }

    /**
     * Getter
     * @return nMax
     */
    public int getIntentosMax() {
        return nMax;
    }

    /**
     * Setter
     * @param intentosMax
     */
    public void setIntentosMax(int intentosMax) {
        this.nMax = intentosMax;
    }

    /**
     * Getter
     * @return puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Setter
     * @param puntuacion
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Getter
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Setter
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Getter
     * @return rondasPartida
     */
    public int getRondasPartida() {
        return rondasPartida;
    }

    /**
     * Setter
     * @param rondasPartida
     */
    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    /**
     * Getter
     * @return rondaActual
     */
    public int getRondaActual() {
        return rondaActual;
    }

    /**
     * Setter
     * @param rondaActual
     */
    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    /**
     * Getter
     * @return fallos
     */
    public int getFallos() {
        return fallos;
    }

    /**
     * Setter
     * @param fallos
     */
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    /**
     * Instancia la clase estatica a null
     */
    private static Singleton instance = null;

    /**
     * Metodo getInstance()
     * @return instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Genera un numero aleatorio entre 1 y 10
     */
    public void generarNumAleatorio() {

    }

    /**
     * Pide un número al usuario
     */
    public void pedirNumero() {

    }

    /**
     * Comprueba si el numero pedido por el usuario es el mismo que el generado aleatoriamente
     */
    public void comprobarNumero() {

    }

    /**
     * En caso de haber acertado el numero en menos de dos intentos, aumenta la puntuacion del usuario
     */
    public void aumentarPuntuacion() {

    }

    /**
     * Pide el alias al usuario
     */
    public void solicitarAlias() {

    }

    /**
     * Calcula el numero de fallos cometido por el usuario en cada ronda
     */
    public void calcularNumFallos() {

    }

    /**
     * Cuenta el numero de rondas totales que lleva el usuario en cada partida
     */
    public void contarRondas() {

    }
}
