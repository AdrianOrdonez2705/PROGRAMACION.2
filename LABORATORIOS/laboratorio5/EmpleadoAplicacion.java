package laboratorio5;

import java.util.Scanner;


public class EmpleadoAplicacion {
    public static void main(String[] args) {
        String nombre = "";
        int CI = 0;

        double sueldoFijo = 0.0;

        double comisionExtra = 0.0;
        double tarifaExtra = 0.0;

        double pago = 0.0;
        int horas = 0;

        double tarifa = 0.0;
        double ventasBrutas = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el numero de CI del empleado: ");
        CI = scanner.nextInt();

        String opcion = "";
        while(!opcion.equals("4")){
            scanner.nextLine();
            System.out.println("\tOPCIONES\n1.Asalariado\n2.Por Horas\n3.Por Comision\n4.SALIR DEL MENU\n");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    int variable = 0;
                    System.out.println("Ingrese el sueldo fijo semanal en Bs: ");
                    sueldoFijo = scanner.nextDouble();

                    System.out.println("¿El empleado admite comision?\n1.SI\n2.NO");    
                    variable = scanner.nextInt();

                    if (variable == 1){
                        System.out.println("Ingrese el total de ventas en Bs: ");
                        comisionExtra = scanner.nextDouble();
                        System.out.println("Ingrese la tarifa por comsion (%): ");
                        tarifaExtra = scanner.nextDouble();

                        AsalariadoMasComision asalariadoMasComision = new AsalariadoMasComision(nombre, CI, sueldoFijo, comisionExtra, tarifaExtra);
                        System.out.println("El salario mensual de "+asalariadoMasComision.getNombre()+" con CI "+asalariadoMasComision.getCI()+" es de Bs "+asalariadoMasComision.calcularSalario()+"\n");
                        break;
                    }
                    else{
                        Asalariado asalariado = new Asalariado(nombre, CI, sueldoFijo);
                        System.out.println("El salario mensual de " + asalariado.getNombre() + " con CI " + asalariado.getCI() + " es de Bs " + asalariado.calcularSalario() + "\n");
                        break;
                    }
                case "2":
                    System.out.println("Ingrese el pago por hora al empleado en Bs: ");
                    pago = scanner.nextDouble();
                    System.out.println("Ingrese la horas trabajadas: ");
                    horas = scanner.nextInt();

                    PorHoras porHoras = new PorHoras(nombre, CI, pago, horas);
                    System.out.println("El salario mensual de " + porHoras.getNombre() + " con CI " + porHoras.getCI() + " es de Bs " + porHoras.calcularSalario() + "\n");
                    break;
                case "3":
                    System.out.println("Ingrese la tarifa (%): ");
                    tarifa = scanner.nextDouble() / 100;
                    System.out.println("Ingrese el total de las ventas brutas en Bs: ");
                    ventasBrutas = scanner.nextDouble();

                    PorComision porComision = new PorComision(nombre, CI, tarifa, ventasBrutas);
                    System.out.println("El salario mensual de " + porComision.getNombre() + " con CI " + porComision.getCI() + " es de Bs " + porComision.calcularSalario() + "\n");
                    break;
                case "4":
                    System.out.println("SALIENDO...");
                    break;
            }
        }
        scanner.close();
    }
}
