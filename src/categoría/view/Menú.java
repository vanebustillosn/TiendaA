package categor�a.view;

import java.util.Scanner;

import categor�a.entity.NoExisteCategor�a;
import view.InputTypes;

public class Men� {

	
	/****************************
	 * Encabezado del men�      *
	 ****************************/
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Categor�a");
			System.out.println("2. Listar Categor�as ");
			System.out.println("3. Eliminar Categor�a ");
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
	
	public static void men�(Scanner scanner, Categor�asIO categor�asView) {
		boolean salir = false;
		
		
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categor�asView.add();
				break;
			case 2:
				categor�asView.list();
				break;
			case 3:
				try {
					categor�asView.delete();
				} catch (NoExisteCategor�a e) {
					System.out.println("No Existe la Categor�a");
				}
				break;
			
			}
		}
	}
}
