package PRACTICAS.practica05.Ejercicio2;

public class EstudianteRegular extends Estudiante {
	
	String departamento;

	public EstudianteRegular(String nombre, int carnet, String fechaNacimiento, String carrera, String nacionalidad, String departamento, String ubicacion) {
		super(nombre,carnet,fechaNacimiento,carrera,nacionalidad,ubicacion);
		this.departamento = departamento;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public int getCarnet() {
		return carnet;
	}
	@Override
	public String getFecha() {
		return fechaNacimiento;
	}
	@Override
	public String getCarrera() {
		return carrera;
	}
	@Override
	public String getNacionalidad() {
		return nacionalidad;
	}
	@Override
	public String getUbicacion() {
		return ubicacion;
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	@Override
	public void setFecha(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
