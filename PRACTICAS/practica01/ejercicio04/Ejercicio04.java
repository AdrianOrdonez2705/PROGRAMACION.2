package PRACTICAS.practica01.ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;

        float deuda = 0;
        do{
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    deuda = agregarDeuda(deuda,scanner);
                    break;
            
                case 5:
                    break;
            }

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

    public static float agregarDeuda(float deuda, Scanner scanner){
        float[] UVE = {1164, 2910, 3492, 4074, 8730};

        System.out.println("Nro de materias UVE 2: ");
        float N_uve_2 = scanner.nextInt();

        System.out.println("Nro de materias UVE 5: ");
        float N_uve_5 = scanner.nextInt();

        System.out.println("Nro de materias UVE 6: ");
        float N_uve_6 = scanner.nextInt();

        System.out.println("Nro de materias UVE 7: ");
        float N_uve_7 = scanner.nextInt();

        System.out.println("Nro de materias UVE 15: ");
        float N_uve_15 = scanner.nextInt();

        deuda = (N_uve_2 * UVE[0]) + (N_uve_5 * UVE[1]) + (N_uve_6 * UVE[2]) + (N_uve_7 * UVE[3]) + (N_uve_15 * UVE[4]);

        System.out.println("Su deuda (semestral) es de Bs: " + deuda + "\n");

        return deuda;

    }
}
