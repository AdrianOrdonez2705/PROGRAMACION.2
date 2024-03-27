package laboratorio5;

public class PorComision extends Empleado {
    
    public double tarifa;
    public double ventasBrutas;

    public PorComision(String nombre, int CI, double tarifa, double ventasBrutas){
        super(nombre, CI);
        this.tarifa = tarifa;
        this.ventasBrutas = ventasBrutas;
    }

    public double calcularSalario(){
        return getTarifa()*getVentasBrutas();
    }

    // tarifa
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double getTarifa() {
        return tarifa;
    }
    //Ventas Brutas
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    public double getVentasBrutas() {
        return ventasBrutas;
    }
}