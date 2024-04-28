package PRACTICAS.practica03.Ejercicio3;

import java.util.ArrayList;

public class Mantenimiento extends Administrativo implements Salario{
    private ArrayList<String> salonesAsignados = new ArrayList<String>();
    private int horasExtra;

    public Mantenimiento(String nombre,int cedula,String dependencia,double salarioBase,ArrayList<String> salonesAsignados,int horasExtras){
        super(nombre, cedula, dependencia, salarioBase);
        this.salonesAsignados=salonesAsignados;
        this.horasExtra=horasExtras;
    }

    // Inicio - getters y setters
    public ArrayList<String> getSalonesAsignados() {
        return salonesAsignados;
    }
    public void setSalonesAsignados(ArrayList<String> salonesAsignados) {
        this.salonesAsignados = salonesAsignados;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    // Fin - getters y setters


    public void CalcularSalario() {
        setSalarioBase(getSalarioBase()+(40*getHorasExtra()));
    }
    
    public double SalarioFinal(){
        CalcularSalario();
        return getSalarioBase();
    }
}
