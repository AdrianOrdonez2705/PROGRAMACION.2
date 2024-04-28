package PRACTICAS.practica03.Ejercicio3;

public class RecursosHumanos extends Administrativo implements Salario{
    private String tipo;

    public RecursosHumanos(String nombre,int cedula,String dependencia,double salarioBase,String tipo){
        super(nombre, cedula, dependencia, salarioBase);
        this.tipo=tipo;
    }

    // Inicio - getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Fin - getters y setters


    public void CalcularSalario() {
        if (getTipo().equals("Tesoreria")){
            setSalarioBase(getSalarioBase()+1000.00);
        }else{
            setSalarioBase(getSalarioBase()+700.00);
        }
    }

    public double SalarioFinal(){
        CalcularSalario();
        return getSalarioBase();
    }
}
