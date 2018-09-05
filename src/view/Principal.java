package view;
import java.util.Scanner;

import categoría.control.Categorías;
import categoría.view.CategoríasIO;
import producto.control.Productos;
import producto.view.ProductosIO;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // permite ingresar datos por el teclado
		
		Categorías categorías= new Categorías(10);
		Productos productos = new Productos(10);
		
		ProductosIO productosIO = new ProductosIO(productos,categorías,scanner);// parámetros del constructor
		CategoríasIO categoríasIO = new CategoríasIO(categorías, productos, scanner);
		
		view.Menú.menú(scanner, productosIO, categoríasIO);
		categoría.view.Menú.menú(scanner, categoríasIO);
		producto.view.Menú.menú(scanner, productosIO);
		
		scanner.close();
	}
}
