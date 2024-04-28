package PRACTICAS.practica03.Ejercicio3;

public abstract class Empleado {
    private String nombre;
    private int cedula;
    private String dependencia;

    public Empleado(String nombre,int cedula,String dependencia){
        this.nombre=nombre;
        this.cedula=cedula;
        this.dependencia=dependencia;
    }

    // Inicion - getteres y setteres
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getDependencia() {
        return dependencia;
    }
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Fin gettwers y setters

    public abstract double SalarioFinal();
}
