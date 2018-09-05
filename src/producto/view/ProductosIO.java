package producto.view;
import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.NoExisteCategoría;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class ProductosIO {
	private Productos productos;
	private Scanner scanner;
	private Categorías categorías;
	
	
	/****************************
	 * Constructor              *
	 ****************************/
	
	public ProductosIO(Productos productos, Categorías categorías, Scanner scanner) {
		
		this.scanner = scanner;
		this.categorías= categorías;
		this.productos= productos;
	}

	
	/****************************
	 * Agregar productos        
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void add() throws NoExisteCategoría  {
		Producto producto;
		producto = ProductoIO.ingresar(scanner, categorías);
		productos.ingresar(producto);
	}
	
	
	/****************************
	 * Listar productos         *
	 ****************************/
	
	public void list( ) {
		int codCategoría=0;
		int índice=0;
		for(int i=0; i < productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategoría= productos.getProductos()[i].getCodCategoría();
			try {
			índice= categorías.buscar(codCategoría);
			System.out.println(categorías.getCategorías()[índice]);
			} catch (NoExisteCategoría e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void listProducts() throws NoExisteCategoría {
		int codCategoría = InputTypes.readInt("Código de categoría: ", scanner);
		System.out.println(categorías.getCategorías()[categorías.buscar(codCategoría)]);
		for(int i=0; i < productos.getCantidad(); i++)
		{
			if (codCategoría==productos.getProductos()[i].getCodCategoría())
			System.out.println(productos.getProductos()[i]);	
		}
	}

	
	/****************************
	 * Eliminar productos       *
	 ****************************/
	
	public void delete() {
		int codProducto = InputTypes.readInt("Código de producto: ", scanner); 
		//ingrese el código del producto a borrar
		productos.eliminar(codProducto);
	}


}
