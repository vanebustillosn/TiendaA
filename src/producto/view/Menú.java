package producto.view;

import java.util.Scanner;

import categor�a.entity.NoExisteCategor�a;
import view.InputTypes;


public class Men� {

	
	/****************************
	 * Encabezado del men�      *
	 ****************************/
	
	private static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Producto");
			System.out.println("2. Listar Productos ");
			System.out.println("3. Eliminar Producto ");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("�Su opci�n? ", scanner);

			if (opcion >= 0 && opcion <= 3) {
				return opcion;
			}
		}
	}
	

	/****************************
	 * Opciones del men�        *
	 ****************************/
	
	public static void men�(Scanner scanner, ProductosIO productosView) {
		boolean salir = false;
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					productosView.add();
				} catch (NoExisteCategor�a e) {
					System.out.println(" No Existe Categor�a");
				}
				break;
			case 2:
				productosView.list();
				break;
			case 3:
				productosView.delete();
				break;
			
			}
		}
	}
}
