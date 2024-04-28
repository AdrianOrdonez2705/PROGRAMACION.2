package PRACTICAS.practica03.Ejercicio2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        VehiculoRodante vehiculorodante = llenarDatos("Vehiculo rodante");
        VehiculoRodante camion = llenarDatos("Camion");
        VehiculoRodante automovil = llenarDatos("AutoMovil");
        JOptionPane.showMessageDialog(null,vehiculorodante.DatosVehiculo());
        JOptionPane.showMessageDialog(null,camion.DatosVehiculo());
        JOptionPane.showMessageDialog(null,automovil.DatosVehiculo());
    }

    public static VehiculoRodante llenarDatos(String vehiculo){
        VehiculoRodante Vehiculo = null;
        int numeroRuedas=0;
        String excepcionNumerico="Ingrese unicamente un valor numerico entero";
        int numeroCapacidadPasajeros=0;
        int numeroPasajeros=0;
        while (true) {
            try {
                numeroRuedas=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de ruedas de "+vehiculo));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, excepcionNumerico);
            }
        }
        while (true) {
            try {
                numeroCapacidadPasajeros=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la capacidad maxima de pasajeros de "+vehiculo));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,excepcionNumerico);
            }
        }
        while (true) {
            try {
                while (true){
                    numeroPasajeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasajeros actuales de "+vehiculo));
                    if (numeroPasajeros<=numeroCapacidadPasajeros){
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Ingrese un numero de pasajeros menor o igual a la capacidad maxima de "+numeroCapacidadPasajeros+" pasajeros");
                }
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,excepcionNumerico);
            }
        }
        if (vehiculo.equals("Vehiculo rodante")){
            Vehiculo = new VehiculoRodante(numeroRuedas, numeroCapacidadPasajeros, numeroPasajeros);
        }else if (vehiculo.equals("Camion")){
            Vehiculo = new Camion(numeroRuedas, numeroCapacidadPasajeros, numeroPasajeros);
        }else if (vehiculo.equals("AutoMovil")){
            String tipoAutoMovil=JOptionPane.showInputDialog("Ingrese el tipo de automovil");
            Vehiculo = new AutoMovil(numeroRuedas, numeroCapacidadPasajeros, numeroPasajeros, tipoAutoMovil);
        }
        return Vehiculo;
    }
}
