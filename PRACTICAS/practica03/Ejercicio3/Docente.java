package PRACTICAS.practica03.Ejercicio3;

public abstract class Docente extends Empleado {
    private double calificacionAsignada;
    private double salario;
    
    public Docente(String nombre,int cedula,String dependencia,double calificacionAsignada,double salario){
        super(nombre, cedula, dependencia);
        this.calificacionAsignada=calificacionAsignada;
        this.salario=salario;
    }

    public double getCalificacionAsignada() {
        return calificacionAsignada;
    }
    public void setCalificacionAsignada(double calificacionAsignada) {
        this.calificacionAsignada = calificacionAsignada;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
