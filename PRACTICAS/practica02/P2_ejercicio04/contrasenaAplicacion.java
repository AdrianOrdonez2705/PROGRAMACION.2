package PRACTICAS.practica02.P2_ejercicio04;

import java.util.Scanner;

public class contrasenaAplicacion {
    public static void main(String[] args) {
        String contrasena = "";
        boolean verifier = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contrasena: ");
        contrasena = scanner.nextLine();

        validarContrasena password = new validarContrasena(contrasena, verifier);

        password.controlContrasena();
        password.confirmarContrasena();

        scanner.close();
    }
}
