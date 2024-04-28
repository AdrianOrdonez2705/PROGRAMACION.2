package PRACTICAS.practica03.Ejercicio2;

public class AutoMovil extends VehiculoRodante{
    public String tipoAutoMovil;
    public AutoMovil(int numeroRuedas,int numeroCapacidadPasajeros,int numeroPasajeros,String tipoAutoMovil){
        super(numeroRuedas, numeroCapacidadPasajeros, numeroPasajeros);
        this.tipoAutoMovil=tipoAutoMovil;
    }

    public String getTipoAutoMovil() {
        return tipoAutoMovil;
    }
    public void setTipoAutoMovil(String tipoAutoMovil) {
        this.tipoAutoMovil = tipoAutoMovil;
    }

    @Override
    public String DatosVehiculo() {
        String datos="Tipo automovil: "+getTipoAutoMovil();
        return super.DatosVehiculo()+datos;
    }
}
