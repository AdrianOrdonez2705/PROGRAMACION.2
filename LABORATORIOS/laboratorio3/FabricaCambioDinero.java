package laboratorio3;

import java.util.Scanner;

public class FabricaCambioDinero {
    public static void main(String[] args) {

        double salida = 0;
        double monto = 0;

        CambioDinero entrada = new CambioDinero();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un monto: ");
        monto = scanner.nextDouble();

        if(scanner.nextInt() == 1){
            salida = entrada.BolADol_Ofi(monto);
            System.out.println("Cambio: " + salida);
        }

        else{
            salida = entrada.BolADol_Par(monto);
            System.out.println("Cambio: " + salida);
        } 
        scanner.close();     
    }
}
