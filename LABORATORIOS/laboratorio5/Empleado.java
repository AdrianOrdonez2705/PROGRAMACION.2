package laboratorio5;

public abstract class Empleado {
    public String nombre;
    public int CI;
    
    public Empleado(String nombre, int CI){
        this.nombre = nombre;
        this.CI = CI;
    }
    // nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    // CI
    public void setCI(int cI) {
        CI = cI;
    }
    public int getCI() {
        return CI;
    }

    public abstract double calcularSalario();
}

