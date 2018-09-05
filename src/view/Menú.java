package view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import categoría.view.CategoríasIO;
import producto.control.Productos;
import producto.view.ProductosIO;

public class Menú {
	/****************************
	 * Encabezado del menú      *
	 ****************************/
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("          INGRESE SU OPCIÓN: ");
			System.out.println("------------------------------------ ");
			System.out.println("1. Menú Productos");
			System.out.println("2. Menú Categorías ");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 2) {
				return opcion;
			}
		}
	}
	public static void menú(Scanner scanner, ProductosIO productosView, CategoríasIO categoríasView) {
		boolean salir = false;
		
		Categorías categorías= new Categorías(10);
		Productos productos = new Productos(10);
		
		ProductosIO productosIO = new ProductosIO(productos,categorías,scanner);// parámetros del constructor
		CategoríasIO categoríasIO = new CategoríasIO(categorías, productos, scanner);
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				producto.view.Menú.menú(scanner, productosIO);
				break;
			case 2:
				categoría.view.Menú.menú(scanner, categoríasIO);
				break;
			
		}
	}
	}
}

