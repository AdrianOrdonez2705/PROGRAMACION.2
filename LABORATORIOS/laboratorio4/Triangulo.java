package laboratorio4;

public class Triangulo extends Figura{
    
    public double lado;

    public Triangulo(String color, String nombre, double lado){
        super(color,nombre);
        this.lado = lado;
    }

    @Override
    public double area(){
        return 0.5 * getLado() * getLado();
    }

    @Override
    public double perimetro(){
        return 3 * getLado();
    }

    // Lado
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

}
