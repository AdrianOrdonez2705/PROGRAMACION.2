package PRACTICAS.practica01.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    
    // Función de números amigos
    public static void numerosAmigos(){

        //Entrada del primer número
        System.out.println("Ingrese el primer numero: ");
        Scanner scanner1 = new Scanner(System.in);
        int numero1 = scanner1.nextInt();

        //Entrada del segundo número
        System.out.println("Ingrese el segundo numero: ");
        Scanner scanner2 = new Scanner(System.in);
        int numero2 = scanner2.nextInt();

    }

    public static void main(String[] args) {
        numerosAmigos();
    }


}
