package laboratorio3;

import java.util.Scanner;

public class FabricaPrimoConstructor {
    
    public static void main(String[] args) {
        int numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();

        // Creación de Objeto con Constructor
        NumeroPrimoConstructor number = new NumeroPrimoConstructor(numero);

        // Método
        number.NumeroEsPrimo();

        scanner.close();
    }
}
