import java.util.Random;
import java.util.Scanner;

/**
 * @author Ana
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println("¡Hola! Bienvenido al juego. Por favor,  introduce tu nombre: ");
        s.solicitarAlias();
        System.out.println("Bien, " + s.getAlias() + ", las reglas on muy sencillas:\nVas a tener que adivinar un numero " +
                "aleatorio del 1 al 10\nTendrás dos intentos como máximo\nUna partida tendrá 10 rondas\n¡Disfruta! ");
        s.generarNumAleatorio();
        s.pedirNumero();
        s.comprobarNumero();
        s.aumentarPuntuacion();
        s.calcularNumFallos();
        s.contarRondas();
    }
}
