package projectogithub;

public class Producto {

	private int id;
	private String nombre;
	private String marca ;
	private int cantidad;
	private String color;
	
	public Producto(int id, String nombre, String marca, int cantidad, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + ",color=" + color + "]";
	}
	
	
	
	
}
