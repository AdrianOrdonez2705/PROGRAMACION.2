package PRACTICAS.practica02.P3_ejercicio03;

public class pagoMensual {
    double salario;
    String entrada;
    String salida;

    public pagoMensual(double salario, String entrada, String salida){
        this.salario = salario;
        this.entrada = entrada;
        this.salida = salida;
    }

    public double calcularAtrasosEntrada(){
        double monto = getSalario();
        double jornada = getSalario() / 30;
        String[] entry = getEntrada().split(":");

        int horaEntry = Integer.parseInt(entry[0]);
        int minutoEntry = Integer.parseInt(entry[1]);

        if (horaEntry == 8){
            if(minutoEntry >= 31 && minutoEntry < 60){
                monto = getSalario() - ((minutoEntry - 30) * jornada);
            }
            else{
                monto = getSalario();
            }
        }
        else if(horaEntry < 8){
            monto = getSalario();
        }
        else{
            monto = 0;
        }

        setSalario(monto);

        return monto;
    }

    // SALARIO
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // ENTRADA
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getEntrada() {
        return entrada;
    }

    // SALIDA
    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getSalida() {
        return salida;
    }
}
