package laboratorio4;

import java.util.Scanner;

public class FiguraAplicacion {
    public static void main(String[] args) {

        String color = "";
        String nombre = "";
        double lado = 0;
        double radio = 0;
        double pi = 3.1416;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un color: ");
        color = scanner.nextLine();
        System.out.println("Ingrese un nombre: ");
        nombre = scanner.nextLine();

        Cuadrado cuad = new Cuadrado(color, nombre, lado);
        Triangulo trian = new Triangulo(color, nombre, lado);
        Circulo circ = new Circulo(color, nombre, radio, pi);

        int flag = 0;
        while(flag != 1){
            System.out.println("\tFIGURAS DISPONIBLES");
            System.out.println("\n1. CUADRADO");
            System.out.println("2. TRIANGULO");
            System.out.println("3. CIRCULO\n");
            System.out.print("Elija una figura: ");
            int opcionFigura = scanner.nextInt();
    
            System.out.println("\n\tMENU DE OPCIONES");
            System.out.println("\n1. Calcular area");
            System.out.println("2. Calcular perimetro");
            System.out.println("3. SALIR\n");
            System.out.print("Ingrese una opcion: ");
            int opcionCalculo = scanner.nextInt();

            switch (opcionCalculo) {
                case 1:
                    if(opcionFigura == 1){
                        System.out.println("Ingrese un lado: ");
                        cuad.lado = scanner.nextDouble();
                        cuad.setLado(cuad.lado);
    
                        System.out.println("El area de " + cuad.getNombre() + " color "  + cuad.getColor() + " es: " + cuad.area() + "\n");
                        break;
                    }
                    if(opcionFigura == 2){
                        System.out.println("Ingrese un lado: ");
                        trian.lado = scanner.nextDouble();
                        trian.setLado(trian.lado);
    
                        System.out.println("El area de " + trian.getNombre() + " color "  + trian.getColor() + " es: " + trian.area() + "\n");
                        break;
                    }
                    if(opcionFigura == 3){
                        System.out.println("Ingrese el radio: ");
                        circ.radio = scanner.nextDouble();
                        circ.setRadio(circ.radio);
    
                        System.out.println("El area de " + circ.getNombre() + " color "  + circ.getColor() + " es: " + circ.area() + "\n");
                        break;
                    }
                case 2: 
                    if(opcionFigura == 1){
                        System.out.println("Ingrese un lado: ");
                        cuad.lado = scanner.nextDouble();
                        cuad.setLado(cuad.lado);
    
                        System.out.println("El perimetro de " + cuad.getNombre() + " color " + cuad.getColor() + " es: " + cuad.perimetro() + "\n");
                        break;
                    }
                    if(opcionFigura == 2){
                        System.out.println("Ingrese un lado: ");
                        trian.lado = scanner.nextDouble();
                        trian.setLado(trian.lado);
    
                        System.out.println("El perimetro de " + trian.getNombre() + " color " + trian.getColor() + " es: "+ trian.perimetro() + "\n");
                        break;
                    }
                    if(opcionFigura == 3){
                        System.out.println("Ingrese el radio: ");
                        circ.radio = scanner.nextDouble();
                        circ.setRadio(circ.radio);
    
                        System.out.println("El perimetro de " + circ.getNombre() + " color " + circ.getColor() + " es: " + circ.perimetro() + "\n");
                        break;
                    }
                default:
                    flag = 1;
                    break;
            }
        }
        
        scanner.close();
    }
}
