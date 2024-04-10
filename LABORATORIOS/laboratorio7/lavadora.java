package LABORATORIOS.laboratorio7;

public class lavadora extends electrodomestico {
    
    public double carga;

    public lavadora(double precioBase, String color, char letra, double peso, double carga){
        super(precioBase, color, letra, peso);
        this.carga = carga;
    }
}
