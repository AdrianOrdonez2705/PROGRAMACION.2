package UltimoLaboratorio.Modelo;

public class Figura {
    public String color;
    public String nombre;

    public Figura(String color, String nombre){
        this.color = color;
        this.nombre = nombre;
    }

    // ÁREA
    public double area(){
        return 0;
    }

    // PERÍMETRO
    public double perimetro(){
        return 0;
    }

    // COLOR
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    // NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

