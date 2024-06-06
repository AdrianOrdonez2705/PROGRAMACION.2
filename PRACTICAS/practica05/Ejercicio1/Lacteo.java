package PRACTICAS.practica05.Ejercicio1;

public class Lacteo extends product {
	
	public Lacteo(int codigo, String nombre, double precioUnitario, int stock, double descuento) {
		super(codigo,nombre,precioUnitario,stock,descuento);
	}
	
	@Override
	public double calcularDescuento() {
		return 5;
	}
	
	@Override
	public int getCodigo() {
		return codigo;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	@Override
	public int getStock() {
		return stock;
	}
	@Override
	public double getDescuento() {
		return descuento;
	}
	
	@Override
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Override
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
