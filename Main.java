package projectogithub;

public class MainTienda {

	public static void main(String[] args) {

		Tienda mercadona= new Tienda ();
		mercadona.añadirCliente();
		mercadona.añadirProducto();
		

		Tienda teashop = new Tienda ();
		
		teashop.mostrarClientes();
		teashop.mostrarProductos();

		
		
		
		System.out.println("Esto es una prueba de git");
	

		System.out.println(teashop.toString());

		
		Tienda decathlon = new Tienda ();
		System.out.println(decathlon.toString());

		Tienda fruteria = new Tienda("Avenida Barcelona 4", 911235040);
		Tienda pescaderia = new Tienda("Calle Mayor 56", 923461826);
		Tienda libreria = new Tienda("Via Adamo 7", 934571895);
	}

}
