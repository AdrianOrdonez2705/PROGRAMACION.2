package PRACTICAS.practica03.Ejercicio3;

public abstract class Administrativo extends Empleado{
    private double salarioBase = 5000.00;

    public Administrativo(String nombre,int cedula,String dependencia,double salarioBase){
        super(nombre, cedula, dependencia);
        this.salarioBase=salarioBase;
    }

    // Inicio - getters y setters
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    // Fin - getters y setters
}
