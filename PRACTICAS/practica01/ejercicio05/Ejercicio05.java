package PRACTICAS.practica01.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    
    // Función de entrada de la fecha de nacimiento
    public static void ingresarFecha(){
        // Especificar el formato
        String formato = "\\p{1,2}/\\p{1,2}\\/p{4}";
        Scanner scannerFormato = new Scanner(System.in);

        // Entrada de la fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento en el formato dd/mm/aaaa: ");
        String fecha = scannerFormato.nextLine();

        // Verificar el formato correcto
        while(!fecha.matches(formato)){
            System.out.println("Formato no válido, intente de nuevo");
            fecha = scannerFormato.nextLine();
        }

        System.out.println("Su fecha ingresada es " + fecha);
        
    }
}
