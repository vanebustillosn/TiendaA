package producto.view;

import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import producto.entity.Producto;
import view.InputTypes;

public class ProductoIO {

	public static Producto ingresar(Scanner scanner, Categorías categorías) throws NoExisteCategoría {
		int valor= -1;
		
		int codProducto = InputTypes.readInt("Ingrese el código del producto", scanner);
		String nombreProducto = InputTypes.readString("Nombre: ", scanner);
		double precio = InputTypes.readDouble("Precio: ", scanner);
		String descripción = InputTypes.readString("Descripción: ", scanner);

		valor = InputTypes.readInt("Código Categoría: ", scanner);
		
		if (!categorías.searchBoolean(valor)) {
			throw new NoExisteCategoría();
		}
		int codCategoría = valor;
		return new Producto(codProducto, nombreProducto, precio, descripción, codCategoría);

	}
}
