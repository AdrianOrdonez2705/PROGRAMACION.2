package PRACTICAS.practica01.ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;

        do{
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while(opcion != 5);

        scanner.close();
    }

    public static void menu(){

        System.out.println("\tMENU DE OPCIONES");
        System.out.println("1. Agregar deuda por toma de materias");
        System.out.println("2. Agregar descuento por 'pronto pago'");
        System.out.println("3. Facturar monto");
        System.out.println("4. Desplegar 'Estado de Cuentas'");
        System.out.println("5. SALIR");
        System.out.println("Ingrese una opcion: ");

    }
}
