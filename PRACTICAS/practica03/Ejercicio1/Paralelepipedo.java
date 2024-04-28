package PRACTICAS.practica03.Ejercicio1;

public class Paralelepipedo extends Cuadrado{
    private double altura;
    public Paralelepipedo(String nombre,double lado1,double lado2,double altura){
        super(nombre, lado1, lado2);
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double Superficie(){
        return super.Superficie();
    }
    @Override
    public double Volumen(){
        return getAltura()*getLado1()*getLado2();
    }
}
