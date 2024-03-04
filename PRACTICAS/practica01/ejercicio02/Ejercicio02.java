package PRACTICAS.practica01.ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese texto: ");
        String texto = scanner.nextLine();

        contarPalabras(texto);

        scanner.close();
    }

    public static void contarPalabras(String texto){
        // Separar partes del texto entre caracteres no alfa numéricos
        String[] partes = texto.split("\\W+");

        int contador = 0;

        // Hallar longitud del arreglo de partes
        int longitud = partes.length;
        for(int i = 0; i < longitud; i++){
            String palabra = partes[i];
            // Ver los espacios o signos que no sean palabras
            if(!palabra.isEmpty()){
                contador ++;
            }
        }

        System.out.println("Cantidad de palabras: " + contador);
    }
}
