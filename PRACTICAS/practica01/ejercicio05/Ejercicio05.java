package PRACTICAS.practica01.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    
    // Función para hallar los dígitos y sumarlos
    public static int hallarDigitos(int tuNumero){
        int sumador = 0;
	    while(tuNumero > 0){
		    sumador += tuNumero % 10;
		    tuNumero = tuNumero/10;
	    }
	    return sumador;
    }

    // Función de entrada de la fecha de nacimiento
    public static void ingresarFecha(){
        // Especificar el formato
        String formato = "\\d{1,2}/\\d{1,2}/\\d{4}";
        Scanner scannerFormato = new Scanner(System.in);

        // Entrada de la fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento en el formato dd/mm/aaaa: ");
        String fecha = scannerFormato.nextLine();

        // Verificar el formato correcto con la funcion .match() de java
        while(!fecha.matches(formato)){
            System.out.println("Formato no válido, intente de nuevo");
            fecha = scannerFormato.nextLine();
        }

        scannerFormato.close();

        // Imprimir la fecha ingresada para verificar
        System.out.println("Su fecha ingresada es " + fecha);
        
        // Separar el String de fecha para "/" en un vector tipo String
        String[] fechaSeparada = fecha.split("/");

        // Convertir las fechas separadas de String a Int con la función Integer.parseInt() de java y almacenarlas en el vector
        int dia = Integer.parseInt(fechaSeparada[0]);
        int mes = Integer.parseInt(fechaSeparada[1]);
        int ano = Integer.parseInt(fechaSeparada[2]);

        // Imprimir los valores Int de las fechas separadas del vector para verificar
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);

        // Llamar a la funcion
        numeroDeVida(dia,mes,ano);
    }

     // Función para encontrar tu Número
     public static void numeroDeVida(int dia, int mes, int ano){
        int tuNumero = dia + mes;
	    while(ano > 0){
		    tuNumero += ano % 10;
		    ano = ano/10;
	    }
	
	    while(tuNumero > 9){
		    tuNumero = hallarDigitos(tuNumero);
	    }

        // Desplegar el numero de vida y su significado
        String[] sentido = {"Unidad","Comunion/Division","3en1, 1en3","Estabilidad","Favor Inmerecido","Humanidad","Perfeccion","Nuevo Comienzo","Resultados Positivos"};
        System.out.println("Tu Numero de Vida es: " + tuNumero);
        System.out.println("Su significado es: " + sentido[tuNumero-1]);
    }

    public static void main(String[] args) {
        ingresarFecha();
    }

}
