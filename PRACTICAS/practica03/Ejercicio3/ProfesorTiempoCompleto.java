package PRACTICAS.practica03.Ejercicio3;

public class ProfesorTiempoCompleto extends Docente implements Salario{
    private int totalHorasInvestigacion;

    public ProfesorTiempoCompleto(String nombre,int cedula,String dependencia,double calificacionAsignada,double salario,int totalHorasInvestigacion){
        super(nombre, cedula, dependencia, calificacionAsignada, salario);
        this.totalHorasInvestigacion=totalHorasInvestigacion;
    }

    // Inicio - getters y settters
    public int getTotalHorasInvestigacion() {
        return totalHorasInvestigacion;
    }
    public void setTotalHorasInvestigacion(int totalHorasInvestigacion) {
        this.totalHorasInvestigacion = totalHorasInvestigacion;
    }
    // Fin - getters y setters

    public void CalcularSalario(){
        if (getCalificacionAsignada()>4.5){
            setSalario(getSalario()+2000.00);
        }
    }
    public double SalarioFinal(){
        CalcularSalario();
        return getSalario();
    }
}