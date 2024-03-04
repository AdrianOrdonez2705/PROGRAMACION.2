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
                case 2: 
                    deuda = descuento(deuda, scanner);
                    break;
                case 3:
                    deuda = facturarMonto(deuda, scanner);
                    break;
                case 4:
                    estadoCuentas(deuda, scanner);
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

    // Agregar Deuda por toma de N materias
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

    // Descuento Pronto Pago
    public static float descuento(float deuda, Scanner scanner){

        int sub_opcion = 0;

        // Submenú para aplicar descuento del 8% por PRONTO PAGO
        System.out.println("¿Aplicar descuento del 8 % por 'PRONTO PAGO'?\n");
        System.out.println("1. SI");
        System.out.println("2. NO\n");
        System.out.println("Ingrese su respuesta: ");
        sub_opcion = scanner.nextInt();

        if(sub_opcion == 1){

            // Calcular descuento
            float descuento = deuda * (8.0f/100.0f);
            deuda = deuda - descuento;
            System.out.println("Nueva deuda menos 8 %: " + deuda + "\n");
        }

        if(sub_opcion == 2){
            System.out.println("Deuda sin cambio: " + deuda + "\n");
        }

        return deuda;
    }

    // Facturar un monto
    public static float facturarMonto(float deuda, Scanner scanner){
        int sub_opcion = 0;

        // Submenú para facturar un monto
        System.out.println("¿Facturar monto por deuda de materias (- 2300) ?\n");
        System.out.println("1. SI");
        System.out.println("2. NO\n");
        System.out.println("Ingrese su respuesta: ");
        sub_opcion = scanner.nextInt();

        if(sub_opcion == 1){

            // Restar monto por aplicación de factura
            deuda = deuda - 2300.0f;
            System.out.println("Nueva deuda por factura: " + deuda + "\n");
        }

        if(sub_opcion == 2){
            
            // Sin reducción por facturación
            System.out.println("Deuda sin resto por facturación: " + deuda + "\n");
        }

        return deuda;
        
    }

    public static void estadoCuentas(float deuda, Scanner scanner){
        System.out.println("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.println("Carnet de Identidad: ");
        int CI = scanner.nextInt();

        String[] fecha = {"08/03/2024", "05/04/2024", "03/05/2024", "03/06/2024"};
        

        float Seg_pago = deuda * 0.147101f; // Segundo pago al 14,7101 %
        float Otro_pago = deuda * 0.283978f; // Pagos restantes al 28.3978 %

        System.out.println("\n\t\t\t\tUniversidad Catolica Boliviana 'San Pablo'\n");
        System.out.println("\t\t\t\t\t\tSEDE LA PAZ");
        System.out.println("\t\t\t\t\t  COTIZACION DE DEUDAS");
        System.out.println("Documento de Identidad: " + CI + "\n");
        System.out.println("Nombre: " + nombre + "\n");
        System.out.println("Fecha de emision:\t03/2024\n");

        System.out.println("DESCRIPCION\t\t\t       FECHA VENCIMIENTO           MONTO\tMULTA\t TOTAL");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("2DO. PAGO DERECHOS ACADEMICOS 1-2024\t  " + fecha[0] + "\t\t" + Seg_pago + "     0.00\t" + Seg_pago);
        System.out.println("3ER. PAGO DERECHOS ACADEMICOS 1-2024\t  " + fecha[1] + "\t\t" + Otro_pago + "     0.00\t" + Otro_pago);
        System.out.println("4TO. PAGO DERECHOS ACADEMICOS 1-2024\t  " + fecha[2] + "\t\t" + Otro_pago + "     0.00\t" + Otro_pago);
        System.out.println("5TO. PAGO DERECHOS ACADEMICOS 1-2024\t  " + fecha[3] + "\t\t" + Otro_pago + "     0.00\t" + Otro_pago);
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("\t\t\tTOTAL BOLIVIANOS A LA FECHA DE EMISION: " + deuda + "     0.00\t" + deuda);
        System.out.println("\n");

    }
}
