import java.util.Random;
import java.util.Scanner;

/**
 * @author Ana
 * @version 1.0
 */

public class Singleton {
    private Singleton() {
    }

    Scanner sc = new Scanner(System.in);

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
     * @param numeroAleatorio : Numero aleatorio
     * @param numeroPropuesto : Numero introducido por el usuario
     * @param nMax            : Numero maximo de intentos
     * @param puntuacion      : Adivinaciones correctas
     * @param alias           : Nombre del usuario
     * @param rondasPartida   : Numero de rondas por partida
     * @param rondaActual     : Ronda actual en la partida
     * @param fallos          : Numero de fallos
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
     *
     * @return numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * Setter
     *
     * @param numeroAleatorio
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * Getter
     *
     * @return numeroPropuesto
     */
    public int getNumeroPropuesto() {
        return numeroPropuesto;
    }

    /**
     * Setter
     *
     * @param numeroPropuesto
     */
    public void setNumeroPropuesto(int numeroPropuesto) {
        this.numeroPropuesto = numeroPropuesto;
    }

    /**
     * Getter
     *
     * @return nMax
     */
    public int getIntentosMax() {
        return nMax;
    }

    /**
     * Setter
     *
     * @param intentosMax
     */
    public void setIntentosMax(int intentosMax) {
        this.nMax = intentosMax;
    }

    /**
     * Getter
     *
     * @return puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Setter
     *
     * @param puntuacion
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Getter
     *
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Setter
     *
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Getter
     *
     * @return rondasPartida
     */
    public int getRondasPartida() {
        return rondasPartida;
    }

    /**
     * Setter
     *
     * @param rondasPartida
     */
    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    /**
     * Getter
     *
     * @return rondaActual
     */
    public int getRondaActual() {
        return rondaActual;
    }

    /**
     * Setter
     *
     * @param rondaActual
     */
    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    /**
     * Getter
     *
     * @return fallos
     */
    public int getFallos() {
        return fallos;
    }

    /**
     * Setter
     *
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
     *
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
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(10) + 1;
    }

    /**
     * Pide un número al usuario
     */
    public void pedirNumero() {
        System.out.print("Ingresa el número que crees: ");
        this.alias = sc.nextLine();
    }

    /**
     * Comprueba si el numero pedido por el usuario es el mismo que el generado aleatoriamente
     */
public void comprobarNumero() {
    if (this.numeroPropuesto == this.numeroAleatorio) {
        System.out.println("¡Felicidades! Has adivinado el número.");
    } else {
        System.out.println("Lo siento, no has adivinado el número. El número era " + this.numeroAleatorio);
        this.nMax--;
    }
}

    /**
     * En caso de haber acertado el numero en menos de dos intentos, aumenta la puntuacion del usuario
     */
public void aumentarPuntuacion() {
    if (this.numeroPropuesto == this.numeroAleatorio && this.nMax > 0) {
        this.puntuacion++;
        System.out.println("¡Bien hecho! Tu puntuación es ahora " + this.puntuacion);
    }
}

    /**
     * Pide el alias al usuario
     */
    public void solicitarAlias() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre: ");
        this.alias = scanner.nextLine();
    }

    /**
     * Calcula el numero de fallos cometido por el usuario en cada ronda
     */
    public void calcularNumFallos() {
        if (this.numeroPropuesto != this.numeroAleatorio) {
            this.fallos++;
            System.out.println("Número de fallos: " + this.fallos);
        }
    }


    /**
     * Cuenta el numero de rondas totales que lleva el usuario en cada partida
     */
    public void contarRondas() {
        this.rondaActual++;
        System.out.println("Ronda: " + this.rondaActual);
    }
}
