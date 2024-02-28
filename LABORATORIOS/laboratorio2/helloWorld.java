package LABORATORIOS.laboratorio2;

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Scanner scanner = new Scanner(System.in); // Crea el cin
        int num = scanner.nextInt(); // =cin
        System.out.println(num);
        scanner.close(); // Cierra el cin
    }
    
}