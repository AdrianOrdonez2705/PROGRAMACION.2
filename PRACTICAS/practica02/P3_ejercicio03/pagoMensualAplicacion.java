package PRACTICAS.practica02.P3_ejercicio03;

import java.util.Scanner;

public class pagoMensualAplicacion {
    public static void main(String[] args) {
        double salario = 0;
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

        pagoMensual pago = new pagoMensual(salario,entrada,salida);

        System.out.println("Pago mensual con atrasos: " + pago.calcularAtrasosEntrada()); 

        scanner.close();

    }
}
