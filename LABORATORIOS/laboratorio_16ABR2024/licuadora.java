package laboratorio_16ABR2024;

public class licuadora extends electrodomestico{

    double litraje;

    public licuadora(double precio, String color, char consumo, double peso, double litraje){
        super(precio, color, consumo, peso);
        this.litraje = litraje;
    }

    public void setLitraje(double litraje) {
        this.litraje = litraje;
    }
    public double getLitraje() {
        return litraje;
    }

    @Override
    public double precioFinal(){

        double cotiz = 0;

        if(litraje >= 2){
            while(litraje != 1){
                cotiz += 10;
                litraje = litraje - 1;
            }
        }

        return super.precioFinal() + cotiz;
    }
    
}
