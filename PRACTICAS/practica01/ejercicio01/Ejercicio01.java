package PRACTICAS.practica01.ejercicio01;

import java.util.Scanner;

public class Ejercicio01{

    // Menú de opciones
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        String texto = "";

        do{
            menu();

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    texto = ingresarTexto(scanner);
                    break;
                case 2:
                    contarVocales(texto);
                    break;
                case 3:
                    contarConsonantes(texto);
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

    // mostrar menu
    public static void menu(){

        System.out.println("\tMENU DE OPCIONES");
        System.out.println("1. Ingresar texto");
        System.out.println("2. Contar vocales");
        System.out.println("3. Contar consonantes");
        System.out.println("4. Encontrar una palabra en el texto");
        System.out.println("5. Reemplazar una palabra por otra");
        System.out.println("OTRO -> SALIR");

    }

    // Ingresar texto
    public static String ingresarTexto(Scanner scanner){
        System.out.println("Ingrese texto: ");
        return scanner.nextLine();
    }

    // Contar vocales
    public static void contarVocales(String texto){
        int contadorVocales = 0;

        // Convertir todo el texto a minúsculas
        texto = texto.toLowerCase();

        // Definir longitud del texto
        int longitud = texto.length();

        for(int i = 0; i < longitud; i++){

            // Recorrer cada letra del texto
            char letra = texto.charAt(i);
            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVocales ++;
            }

        }

        System.out.println("El numero de vocales es: " + contadorVocales);

    }

    public static void contarConsonantes(String texto){
        int contadorConsonantes = 0;

        // Convertir el texto a minúsculas
        texto = texto.toLowerCase();

        // Definir la longitud del texto
        int longitud = texto.length();
    
        for(int i = 0; i < longitud; i++){

            char letra = texto.charAt(i);

            if(letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l'){
                contadorConsonantes ++;
            }

            else if(letra == 'm' || letra == 'n' || letra == 'ñ' || letra == 'p' || letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'v'){
                contadorConsonantes ++;
            }

            else if(letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z'){
                contadorConsonantes ++;
            }

            else{
                contadorConsonantes = contadorConsonantes + 0;
            }
        }

        System.out.println("El numero de consonantes es: " + contadorConsonantes);
    }

}