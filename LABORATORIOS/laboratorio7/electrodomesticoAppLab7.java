package laboratorio7;

import javax.swing.JOptionPane;

public class electrodomesticoAppLab7 {
    public static void main(String[] args) {
        double precioBase = 100;
        String color = "blanco";
        char letra = 'F';
        double peso = 5;
        double carga = 5;

        while(true){
            lavadoraLab7 lavadorita = new lavadoraLab7(precioBase,color,letra,peso,carga);

            letra = JOptionPane.showInputDialog(null,"Ingrese la letra de la lavadora: ").charAt(0);
            color = JOptionPane.showInputDialog(null, "Ingrese el color de la lavadora: ");
            lavadorita.ComprobarConsumoEnergetico(letra);
            lavadorita.ComprobarColor(color);

            break;
        }  
    }
}
