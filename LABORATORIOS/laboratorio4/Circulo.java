package laboratorio4;

public class Circulo extends Figura{

    public double radio;
    public double pi;

    public Circulo(String color, String nombre, double radio, double pi){
        super(color, nombre);
        this.radio = radio;
        this.pi = pi;
    }

    @Override
    public double area(){
        return getPi() * Math.pow(getRadio(),2);
    }

    @Override 
    public double perimetro(){
        return 2 * getPi() * getRadio();
    }

    // RADIO
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    // PI
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getPi() {
        return pi;
    }
}
