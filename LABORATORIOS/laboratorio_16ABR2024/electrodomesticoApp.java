package laboratorio_16ABR2024;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class electrodomesticoApp {
    public static void main(String[] args) {

        float total = 0;
		int cantidad_lavadoras = 0;
        int cantidad_licuadoras = 0;
        int cantidad_microondas = 0;
        int cantidad_tv = 0;

        while(true){
            try {
                cantidad_lavadoras = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Lavadoras: "));
                cantidad_licuadoras = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Licuadoras: "));
                cantidad_microondas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Microondas: "));
                cantidad_tv = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Televisiones: "));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada incorrecta.");
            }
        }

        List <electrodomestico> listaElec = new ArrayList<electrodomestico>();

		List <lavadora> listaLavadoras = new ArrayList <lavadora>();
        List <licuadora> listaLicuadoras = new ArrayList <licuadora>();
        List <microondas> listaMicroondas = new ArrayList <microondas>();
        List <television> listaTelevisiones = new ArrayList <television>();

		for (int i=0; i<cantidad_lavadoras; i++){
            try {

                JOptionPane.showMessageDialog(null, "LAVADORA");
                lavadora electro1= null;
                String colorcito = JOptionPane.showInputDialog("color: ");
                String consume = JOptionPane.showInputDialog("consumo: ");
                char char_consume = consume.charAt(0);
                float weight= Float.parseFloat(JOptionPane.showInputDialog("peso: "));
                float charge= Float.parseFloat(JOptionPane.showInputDialog("carga: "));
                electro1 = new lavadora(100, colorcito, char_consume, weight, charge);
                System.out.println(electro1.precioFinal());
                listaLavadoras.add(electro1);

                listaElec.add(electro1);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada incorrecta.");
                i = i-1;
            }
                
        }

        for(int i=0; i<cantidad_licuadoras; i++){
            try{
                JOptionPane.showMessageDialog(null, "LICUADORA");
                licuadora electro2= null;
                String colorcito = JOptionPane.showInputDialog("color: ");
                String consume = JOptionPane.showInputDialog("consumo: ");
                char char_consume = consume.charAt(0);
                float weight= Float.parseFloat(JOptionPane.showInputDialog("peso: "));
                float capacity= Float.parseFloat(JOptionPane.showInputDialog("capacidad: "));
                electro2 = new licuadora(100, colorcito, char_consume, weight, capacity);
                System.out.println(electro2.precioFinal());
                listaLicuadoras.add(electro2);

                listaElec.add(electro2);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada incorrecta.");
                i = i-1;
            }
        }

        for (int i=0; i<cantidad_microondas; i++){
            try{
                JOptionPane.showMessageDialog(null, "MICROONDAS");

                microondas electro3= null;
                String colorcito = JOptionPane.showInputDialog("color: ");
                String consume = JOptionPane.showInputDialog("consumo: ");
                char char_consume = consume.charAt(0);
                float weight= Float.parseFloat(JOptionPane.showInputDialog("peso: "));
                float capacity= Float.parseFloat(JOptionPane.showInputDialog("capacidad: "));
                double potencia = Float.parseFloat(JOptionPane.showInputDialog("potencia: "));
                electro3 = new microondas(100, colorcito, char_consume, weight, capacity, potencia);
                System.out.println(electro3.precioFinal());
                listaMicroondas.add(electro3);

                listaElec.add(electro3);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada incorrecta.");
                i = i-1;
            }
        }

        for (int i=0; i<cantidad_tv; i++){
            try{
                JOptionPane.showMessageDialog(null, "TELEVISIONES");

                television electro4= null;
                String colorcito = JOptionPane.showInputDialog("color: ");
                String consume = JOptionPane.showInputDialog("consumo: ");
                char char_consume = consume.charAt(0);
                float weight= Float.parseFloat(JOptionPane.showInputDialog("peso: "));
                float pulg = Float.parseFloat(JOptionPane.showInputDialog("Pulgadas: "));
                electro4 = new television(100, colorcito, char_consume, weight, pulg);
                System.out.println(electro4.precioFinal());
                listaTelevisiones.add(electro4);

                listaElec.add(electro4);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada incorrecta.");
                i = i-1;
            }
        }


        for (lavadora tmp: listaLavadoras){
            total += tmp.precioFinal();
		}
        for (licuadora tmp: listaLicuadoras){
            total += tmp.precioFinal();
        }
        for (microondas tmp: listaMicroondas){
            total += tmp.precioFinal();
        }
        for(television tmp: listaTelevisiones){
            total += tmp.precioFinal();
        }

		JOptionPane.showMessageDialog(null,+ total);
    }
}