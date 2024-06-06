package PRACTICAS.practica05.Ejercicio1;

public class product implements InterfazProducto{
	
	public int codigo;
	public String nombre;
	public double precioUnitario;
	public int stock;
	public double descuento;
	
	
	public product(int codigo, String nombre, double precioUnitario, int stock, double descuento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
		this.descuento = descuento;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public int getStock() {
		return stock;
	}
	public double getDescuento() {
		return descuento;
	}
	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public double calcularDescuento() {
		return 0;
	}
}

