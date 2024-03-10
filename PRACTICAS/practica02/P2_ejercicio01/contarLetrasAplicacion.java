package PRACTICAS.practica02.P2_ejercicio01;

import java.util.Scanner;

public class contarLetrasAplicacion {
    public static void main(String[] args) {
        String palabra = "";
        int[] counter = new int[26];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        palabra = scanner.nextLine();

        contarLetras resultado = new contarLetras(palabra,counter);

        resultado.conteo();
        resultado.mostrarResultado();

        scanner.close();
    }
}
