package PRACTICAS.practica05.Ejercicio2;

public class EstudianteExtranjero extends Estudiante {

	public String idioma;
	public int pasaporte;
	
	public EstudianteExtranjero(String nombre, int carnet, String fechaNacimiento, String carrera, String nacionalidad, String ubicacion, String idioma, int pasaporte) {
		super(nombre,carnet,fechaNacimiento,carrera,nacionalidad,ubicacion);
		this.idioma = idioma;
		this.pasaporte = pasaporte;
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
	
	public String getIdioma() {
		return idioma;
	}
	public int getPasaporte() {
		return pasaporte;
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
	
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}
}
