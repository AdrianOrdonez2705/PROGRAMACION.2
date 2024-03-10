package PRACTICAS.practica02.P3_ejercicio03;

public class pagoMensual {
    double salario;
    double jornada;
    String entrada;
    String salida;

    public pagoMensual(double salario, double jornada, String entrada, String salida){
        this.salario = salario;
        this.jornada = jornada;
        this.entrada = entrada;
        this.salida = salida;
    }

    // Pago con atrasos en la entrada 
    public double calcularAtrasosEntrada(){
        setJornada(getSalario()/30);
        String[] entry = getEntrada().split(":");

        int horaEntry = Integer.parseInt(entry[0]);
        int minutoEntry = Integer.parseInt(entry[1]);

        if (horaEntry == 8){
            if(minutoEntry >= 31 && minutoEntry < 60){
                setSalario(getSalario() - ((minutoEntry - 30) * getJornada()));
            }
            else{
                setSalario(getSalario());
            }
        }
        else if(horaEntry < 8){
            setSalario(getSalario());
        }
        else{
            setSalario(0);
        }

        return getSalario();
    }

    // Pago con atrasos en la salida
    public double calcularAtrasosSalida(){
        String[] exit = getSalida().split(":");

        int horaExit = Integer.parseInt(exit[0]);
        int minutoExit = Integer.parseInt(exit[1]);

        if (horaExit == 16){
            if(minutoExit >= 0 && minutoExit < 30){
                setSalario(getSalario() - (minutoExit * getJornada()));
            }
            else{
                setSalario(0);
            }
        }
        else if(horaExit < 16){
            setSalario(getSalario());
        }
        else{
            setSalario(0);
        }
        
        return getSalario();
    }

    // Desplegar ingreso mensual oficial
    public void calcularAtrasos(){
        calcularAtrasosEntrada();
        calcularAtrasosSalida();
        System.out.println("Ingreso mensual con atrasos: " + getSalario());
    }


    // SALARIO
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // JORNADA
    public void setJornada(double jornada) {
        this.jornada = jornada;
    }

    public double getJornada() {
        return jornada;
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
