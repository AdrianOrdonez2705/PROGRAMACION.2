package laboratorio3;

import java.util.Scanner;

public class FabricaCambioConstructor {
    public static void main(String[] args) {
        double monto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un monto: ");
        monto = scanner.nextInt();

        CambioDineroConstructor dinero = new CambioDineroConstructor(monto);

        dinero.opciones();

        scanner.close();
    }
}
