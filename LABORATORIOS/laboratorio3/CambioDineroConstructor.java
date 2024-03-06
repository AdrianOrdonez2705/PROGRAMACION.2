package laboratorio3;

import java.util.Scanner;

public class CambioDineroConstructor {

    Scanner scanner = new Scanner(System.in);
    
    public double monto;

    public int opcion;

    // Constructor
    public CambioDineroConstructor(double monto){
        this.monto = monto;
    }

    // Cambio oficial
    public double cambioOficial(){
        return getMonto() / (6.96);
    }

    // Paralelo Barato
    public double paraleloBarato(){
        return getMonto() / (8.50);
    }

    // Paralelo Caro
    public double paraleloCaro(){
        return getMonto() / (9.97);
    }

    // Bolivianos a Euros
    public double euro(){
        return getMonto() / (7.49);
    }


    // Opciones
    public void opciones(){
       
        
        System.out.println("1. Cambio oficial");
        System.out.println("2. Paralelo Barato");
        System.out.println("3. Paralelo Caro");
        System.out.println("4. Bolivianos a Euros");

        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();

        if(opcion == 1){
            System.out.println("Cambio oficial: " + cambioOficial());
        }
        else if(opcion == 2){
            System.out.println("Cambio Paraleo Barato: " + paraleloBarato()); 
        }
        else if(opcion == 3){
            System.out.println("Cambio Paralelo Caro: " + paraleloCaro()); 
        }
        else if(opcion == 4){
            System.out.println("Cambio a Euros: " + euro()); 
        }
        else{
            System.out.println("Opcion no valida");
        }

    }

    // Setter
    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Getter
    public double getMonto() {
        return monto;
    }

}
