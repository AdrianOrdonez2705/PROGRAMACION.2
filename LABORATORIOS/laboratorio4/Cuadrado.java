package laboratorio4;

// La clase CUADRADO hereda de clase FIGURA
public class Cuadrado extends Figura{

    public double lado;

    public Cuadrado(String color, String nombre, double lado){
        super(color,nombre); // Indica la herencia de los atributos de la clase padre
        this.lado = lado;
    }

    // Sobrescribir un método propia de la clase padre para el método de la clase hija con @Override
    @Override
    public double area(){
        return getLado() * getLado();
    }

    @Override
    public double perimetro(){
        return 4 * getLado();
    }

    // LADO
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
}
