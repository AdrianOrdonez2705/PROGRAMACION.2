package laboratorio5;

public class AsalariadoMasComision extends Asalariado{
    
    public double comisionExtra;
    public double tarifaExtra;

    public AsalariadoMasComision(String nombre, int CI, double sueldoFijo, double comisionExtra, double tarifaExtra){
        super(nombre, CI, sueldoFijo);
        this.comisionExtra = comisionExtra;
        this.tarifaExtra = tarifaExtra;
    }

    @Override
    public double calcularSalario(){
        setTarifaExtra(getTarifaExtra() / 100);
        return getSueldoFijo()*4 + getComisionExtra()*getTarifaExtra();
    }

    // Comision Extra
    public void setComisionExtra(double comisionExtra) {
        this.comisionExtra = comisionExtra;
    }
    public double getComisionExtra() {
        return comisionExtra;
    }
    // Tarifa Extra
    public void setTarifaExtra(double tarifaExtra) {
        this.tarifaExtra = tarifaExtra;
    }
    public double getTarifaExtra() {
        return tarifaExtra;
    }
}
