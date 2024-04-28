package PRACTICAS.practica03.Ejercicio2;

public class VehiculoRodante implements Interface{
    public int numeroRuedas;
    public int numeroCapacidadPasajeros;
    public int numeroPasajeros;

    public VehiculoRodante(int numeroRuedas,int numeroCapacidadPasajeros,int numeroPasajeros){
        this.numeroRuedas=numeroRuedas;
        this.numeroCapacidadPasajeros=numeroCapacidadPasajeros;
        this.numeroPasajeros=numeroPasajeros;
    }

    public int getNumeroCapacidadPasajeros() {
        return numeroCapacidadPasajeros;
    }
    public void setNumeroCapacidadPasajeros(int numeroCapacidadPasajeros) {
        this.numeroCapacidadPasajeros = numeroCapacidadPasajeros;
    }
    public int getNumeroRuedas() {
        return numeroRuedas;
    }
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String DatosVehiculo(){
        String datos="";
        datos+="Datos del vehiculo:"+enter;
        datos+="Numero de ruedas: "+String.valueOf(getNumeroRuedas())+enter;
        datos+="Capacidad de pasajeros: "+String.valueOf(getNumeroCapacidadPasajeros())+enter;
        datos+="Numero de pasajeros: "+String.valueOf(getNumeroPasajeros())+enter;
        return datos;
    }
}
