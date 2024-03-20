package laboratorio4;
/* La herencia es un principio que permite crear nuevas clases (clases hija) a partir de
     * una clase existente (clase padre). De esta manera, la clase hija hereda todos los atributos
     * y métodos de la clase padre.
     * 
     * BENEFICIOS DE LA HERENCIA:
     * - Reutilizar código
     * - Jerarquía de clases
     * - Mantenimiento del código
     * 
     * TIPOS DE HERENCIA:
     * - Simple
     * - Multinivel
     * - Jerárquica
     * 
     * PALABRAS CLAVE PARA LA HERENCIA: 
     * - "extends": 
     *      Se utiliza para indicar que una "clase hija" hereda de una "clase padre".
     * - "super":
     *      Se utiliza dentro de una "clase hija" para acceder a los métodos y atributos
     *      de la "clase padre"
     * 
     * EJEMPLO DE HERENCIA:
     *      Vehiculo (clase padre / Super-clase):
     *          - vagoneta (clase hija / Sub-clase)
     *          - tractor (clase hija / Sub-clase)
     *          - moto (clase hija / Sub-clase)
*/

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

