package PRACTICAS.practica02.P2_ejercicio05;

import java.util.Scanner;

public class secuenciaAplicacion {
    public static void main(String[] args) {
        int tamano = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese n: ");
        tamano = scanner.nextInt();

        secuencia patron = new secuencia(tamano);

        patron.generarSecuencia();

        scanner.close();

    }
}
