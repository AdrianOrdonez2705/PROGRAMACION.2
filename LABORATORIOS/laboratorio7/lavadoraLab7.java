package laboratorio7;

public class lavadoraLab7 extends electrodomesticoLab7 {
    
    public double carga;

    public lavadoraLab7(double precioBase, String color, char letra, double peso, double carga){
        super(precioBase, color, letra, peso);
        this.carga = carga;
    }
}
