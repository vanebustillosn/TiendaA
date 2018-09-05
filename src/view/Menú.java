package view;

import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.NoExisteCategor�a;
import categor�a.view.Categor�asIO;
import producto.control.Productos;
import producto.view.ProductosIO;

public class Men� {
	/****************************
	 * Encabezado del men�      *
	 ****************************/
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("          INGRESE SU OPCI�N: ");
			System.out.println("------------------------------------ ");
			System.out.println("1. Men� Productos");
			System.out.println("2. Men� Categor�as ");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("�Su opci�n? ", scanner);

			if (opcion >= 0 && opcion <= 2) {
				return opcion;
			}
		}
	}
	public static void men�(Scanner scanner, ProductosIO productosView, Categor�asIO categor�asView) {
		boolean salir = false;
		
		Categor�as categor�as= new Categor�as(10);
		Productos productos = new Productos(10);
		
		ProductosIO productosIO = new ProductosIO(productos,categor�as,scanner);// par�metros del constructor
		Categor�asIO categor�asIO = new Categor�asIO(categor�as, productos, scanner);
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				producto.view.Men�.men�(scanner, productosIO);
				break;
			case 2:
				categor�a.view.Men�.men�(scanner, categor�asIO);
				break;
			
		}
	}
	}
}

