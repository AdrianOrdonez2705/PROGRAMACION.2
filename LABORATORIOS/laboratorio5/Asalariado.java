package laboratorio5;

public class Asalariado extends Empleado {
    public double sueldoFijo;
    
    public Asalariado(String nombre, int CI, double sueldoFijo){
        super(nombre, CI);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSalario(){
        return getSueldoFijo() * 4;
    }

    // Sueldo Fijo
    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }
    public double getSueldoFijo() {
        return sueldoFijo;
    }
}