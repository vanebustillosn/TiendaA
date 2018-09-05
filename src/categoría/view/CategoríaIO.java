package categor�a.view;

import java.util.Scanner;

import categor�a.entity.Categor�a;
import view.InputTypes;

public class Categor�aIO {
	
	
	/****************************
	 * Registro de producto     *
	 ****************************/
	
	public static Categor�a ingresar(Scanner scanner) {
		int codProducto = 
				InputTypes.readInt("Ingrese el c�digo de la categor�a", scanner);
		String nombre = 
				InputTypes.readString("Nombre: ", scanner);
		String descripci�n =
				InputTypes.readString("Descripci�n: ", scanner);
		return new 
				Categor�a(codProducto, nombre, descripci�n);
		
	}
}
