package view;
import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.view.Categor�asIO;
import producto.control.Productos;
import producto.view.ProductosIO;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // permite ingresar datos por el teclado
		
		Categor�as categor�as= new Categor�as(10);
		Productos productos = new Productos(10);
		
		ProductosIO productosIO = new ProductosIO(productos,categor�as,scanner);// par�metros del constructor
		Categor�asIO categor�asIO = new Categor�asIO(categor�as, productos, scanner);
		
		view.Men�.men�(scanner, productosIO, categor�asIO);
		categor�a.view.Men�.men�(scanner, categor�asIO);
		producto.view.Men�.men�(scanner, productosIO);
		
		scanner.close();
	}
}
