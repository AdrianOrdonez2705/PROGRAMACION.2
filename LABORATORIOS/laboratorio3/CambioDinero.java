package laboratorio3;

public class CambioDinero {

    double entrada;

    // Bolivianos a Dólares Oficial
    public double BolADol_Ofi(double entrada){
        return entrada / (6.96);
    }

    // Bolivianos a Dólares Paralelo
    public double BolADol_Par(double entrada){
        return entrada / (8.5);
    }




    // Setter
    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    // Getter
    public double getEntrada() {
        return entrada;
    }

}
