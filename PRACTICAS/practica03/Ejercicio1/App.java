package PRACTICAS.practica03.Ejercicio1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bienvenido al calculador de superficies de cuadrado y pralelpipedo.");
        String tipo = "Paralelepipedo";
        double lado1 = EntradaDecimal("Ingresa el lado 1 del "+tipo);
        double lado2 = EntradaDecimal("Ingresa el lado 2 del "+tipo);
        double altura = EntradaDecimal("Ingresa la altura del "+tipo);
        Paralelepipedo paralelepipedo = new Paralelepipedo(tipo, lado1, lado2, altura);
        JOptionPane.showMessageDialog(null,"La superficie del "+tipo+" es de "+paralelepipedo.Superficie());
        JOptionPane.showMessageDialog(null,"El volumen del "+tipo+" es de "+paralelepipedo.Volumen());
    }

    public static double EntradaDecimal(String mensaje){
        double n=0.00;
        while (true) {
            try {
                n=Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                return n;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingresa unicamente valores numericos");
            }
        }
    }
}
