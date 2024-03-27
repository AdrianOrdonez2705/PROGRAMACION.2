package laboratorio5;

public class PorHoras extends Empleado {

    public double pago;
    public int horas;

    public PorHoras(String nombre, int CI, double pago, int horas){
        super(nombre, CI);
        this.pago = pago;
        this.horas = horas;
    }

    public double calcularSalario(){
        if(getHoras() > 40){
            return getPago()*40 + (2 * ((getHoras() - 40) * getPago()));
        }
        else{
            return getPago()*getHoras();
        }
    }

    // Pago
    public void setPago(double pago) {
        this.pago = pago;
    }
    public double getPago() {
        return pago;
    }
    // Horas
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getHoras() {
        return horas;
    }
    
}
