package PRACTICAS.practica03.Ejercicio4;

public class Usuario{
    private String nombre;
    private String apellido;
    private String direccion;
    
    public Usuario (String nombre,String apellido,String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
    }

    // Inicio - getters setters
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Fin - getters setters
}
