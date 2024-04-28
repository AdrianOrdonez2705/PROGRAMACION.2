package PRACTICAS.practica03.Ejercicio3;

public class ProfesorHoraCatedra extends Docente implements Salario{
    private int horasAsignadas;

    public ProfesorHoraCatedra(String nombre,int cedula,String dependencia,double calificacionAsignada,double salario,int horasAsignadas){
        super(nombre, cedula, dependencia, calificacionAsignada, salario);
        this.horasAsignadas=horasAsignadas;
    }

    // Incio - getters y setters
    public int getHorasAsignadas() {
        return horasAsignadas;
    }
    public void setHorasAsignadas(int horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }
    // Fin - getters y setters

    public void CalcularSalario(){
        setSalario(50*getHorasAsignadas());
    }

    public double SalarioFinal(){
        CalcularSalario();
        return getSalario();
    }
}
