package laboratorio3;

import javax.swing.JOptionPane;

public class Graficos {
    public static void main(String[] args) {

        int numero = 0; 

        String cadena = "";
        
        cadena = JOptionPane.showInputDialog("Ingrese un numero: "); // Entrada
        JOptionPane.showMessageDialog(null, cadena); // Salida

        //Convertir Cadena a Entero
        numero = Integer.parseInt(cadena);
        JOptionPane.showMessageDialog(null, cadena+1);
        JOptionPane.showMessageDialog(null, numero+1);
    }
    
}
