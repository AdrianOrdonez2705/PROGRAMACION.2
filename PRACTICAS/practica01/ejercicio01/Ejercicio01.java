package PRACTICAS.practica01.ejercicio01;

import java.util.Scanner;

public class Ejercicio01{


    // Menú de opciones
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;

        do{

        System.out.println("\tMENU DE OPCIONES");
        System.out.println("1. Ingresar texto");
        System.out.println("2. Contar vocales");
        System.out.println("3. Contar consonantes");
        System.out.println("4. Encontrar una palabra en el texto");
        System.out.println("5. Reemplazar una palabra por otra");
        System.out.println("OTRO -> SALIR");

        opcion = scanner.nextInt();

        switch(opcion){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
            
                break;
        }

        } while(opcion != 6);

        scanner.close();
    }
    
}