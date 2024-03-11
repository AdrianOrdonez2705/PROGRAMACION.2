package PRACTICAS.practica02.P2_ejercicio03;

import java.util.Scanner;

public class pagoMensualAplicacion {
    public static void main(String[] args) {
        double salario = 0;
        double jornada = 0;
        String entrada = "";
        String salida = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el salario mensual: ");
        salario = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Ingrese la hora de entrada (hh:mm) : ");
        entrada = scanner.nextLine();

        System.out.println("Ingrese la hora de salida (hh:mm) : ");
        salida = scanner.nextLine();

        pagoMensual pago = new pagoMensual(salario,jornada,entrada,salida);

        pago.calcularAtrasos();

        scanner.close();

    }
}
