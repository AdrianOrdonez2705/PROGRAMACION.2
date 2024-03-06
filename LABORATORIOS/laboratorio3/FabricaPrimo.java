package laboratorio3;

import java.util.Scanner;

public class FabricaPrimo {
    
    public static void main(String[] args) {
        
        int numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();

        NumeroPrimo num = new NumeroPrimo();

        num.esPrimo(numero);

        scanner.close();
    }
}
