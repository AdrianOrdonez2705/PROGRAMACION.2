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
