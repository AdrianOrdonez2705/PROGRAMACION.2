package laboratorio_16ABR2024;

public class television extends electrodomestico{

    double pulgadas;
    
    public television(double precio, String color, char consumo, double peso, double pulgadas){
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
    public double getPulgadas() {
        return pulgadas;
    }

    @Override
    public double precioFinal(){
        if(pulgadas >= 50){
            return super.precioFinal() + 100;
        }

        return super.precioFinal();
    }
}
