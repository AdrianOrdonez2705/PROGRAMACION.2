package PRACTICAS.practica01.ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    
    // Función de números amigos
    public static void numerosAmigos(){

        // Abrir la entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Entrada del primer número
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        //Entrada del segundo número
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Cierre de la entrada de datos
        scanner.close();
        
        //Algoritmo
        int sumador = 0;

        for(int i=1; i < numero1; i++){
            if(numero1 % i == 0){
                sumador += i;
            }
        }

        if(sumador == numero2){
            System.out.println(numero1 + " y " + numero2 + " SI son numeros amigos");
        }
        else{
            System.out.println(numero1 + " y " + numero2 + " NO son numeros amigos");
        }
    }

    public static void main(String[] args) {
        numerosAmigos();
    }

}
