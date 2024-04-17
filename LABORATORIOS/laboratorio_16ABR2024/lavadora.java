package laboratorio_16ABR2024;

public class lavadora extends electrodomestico{

    double carga;

    public lavadora(double precio, String color, char consumo, double peso, double carga){
        super(precio,color,consumo,peso);
        this.carga = carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        if(carga > 30){
            return super.precioFinal() + 50;
        }

        return super.precioFinal();
    }
}