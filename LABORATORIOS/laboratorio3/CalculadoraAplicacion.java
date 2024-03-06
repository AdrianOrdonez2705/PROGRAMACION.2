package laboratorio3;

import java.util.Scanner;

public class CalculadoraAplicacion {
    
    public static void main(String[] args) {
        
        int numeroUno = 0;
        int numeroDos = 0;

        // Para el setter
        int numeroTres = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero 1: ");
        numeroUno = scanner.nextInt();

        System.out.print("Ingrese el numero 2: ");
        numeroDos = scanner.nextInt();

        // Creación de Objeto, CONSTRUCTOR POR DEFECTO
        Calculadora casio = new Calculadora(numeroUno,numeroDos);

        // Llamada a función de SUMA de Calculadora()
        int resultado1 = casio.sumar();
        System.out.println("La suma es: " + resultado1);

        // Llamada a función de RESTA de Calculadora()
        int resultado2 = casio.restar();
        System.out.println("La resta es: " + resultado2);

        // Llamada a función de MULTIPLICACIÓN de Calculadora()
        int resultado3 = casio.multiplicar();
        System.out.println("La multiplicacion es: " + resultado3);

        // Llamada a función de DIVISIÓN de Calculadora()
        double resultado4 = casio.dividir();
        System.out.println("La division es: " + resultado4);

        // Probando el Setter
        System.out.print("\nIngrese el numero 3 (reemplaza al 2): ");
        numeroTres = scanner.nextInt();

        casio.setNum2(numeroTres);
        int resultado5 = casio.sumar();
        System.out.println("La nueva suma es: " + resultado5);

        scanner.close();

    }

}
