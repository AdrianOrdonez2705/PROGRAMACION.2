package PRACTICAS.practica05.Ejercicio2;

public class Estudiante {
	
	public String nombre;
	public int carnet;
	public String fechaNacimiento;
	public String carrera;
	public String nacionalidad;
	public String ubicacion;

	public Estudiante(String nombre, int carnet, String fechaNacimiento, String carrera, String nacionalidad, String ubicacion) {
		this.nombre = nombre;
		this.carnet = carnet;
		this.fechaNacimiento = fechaNacimiento;
		this.carrera = carrera;
		this.nacionalidad = nacionalidad;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCarnet() {
		return carnet;
	}
	public String getFecha() {
		return fechaNacimiento;
	}
	public String getCarrera() {
		return carrera;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	public void setFecha(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
}
