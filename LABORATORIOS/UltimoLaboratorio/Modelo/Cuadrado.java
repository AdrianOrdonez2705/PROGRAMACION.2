package UltimoLaboratorio.Modelo;


public class Cuadrado extends Figura{

    public double lado;

    public Cuadrado(String color, String nombre, double lado){
        super(color,nombre); 
        this.lado = lado;
    }


    @Override
    public double area(){
        return getLado() * getLado();
    }

    @Override
    public double perimetro(){
        return 4 * getLado();
    }


    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
}
