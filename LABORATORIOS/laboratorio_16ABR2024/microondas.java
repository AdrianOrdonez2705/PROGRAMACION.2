package laboratorio_16ABR2024;

public class microondas extends electrodomestico{

    double capacidad;
    double potencia;
    
    public microondas(double precio, String color, char consumo, double peso, double capacidad, double potencia){
        super(precio, color, consumo, peso);
        this.capacidad = capacidad;
        this.potencia = potencia;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public double getPotencia() {
        return potencia;
    }

    @Override
    public double precioFinal(){
        if(potencia % 5 == 0){
            return super.precioFinal() + 5;
        }

        return super.precioFinal();
    }
}
