package producto.control;

import java.util.ArrayList;

import producto.entity.Producto;

public class Productos {
	
	private Producto[] productos;
	private int cantidad;
	private int �ltimo;
	
	public Productos (int tama�o) {
		productos = new Producto[tama�o];
		//ArrayList<Producto> producto= new ArrayList<Producto>();
		cantidad = 0;
		�ltimo = -1;
	}
	
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos[++�ltimo] = producto;
		cantidad++;
	}
	
	public void eliminar(int codProducto) {
		int �ndice = buscar(codProducto);
		
		if (�ndice >= 0) {
			if (�ndice != �ltimo) {
				for (int i=�ndice; i<�ltimo;i++) {
//					Recorrer todos los elementos a partir de i
					productos[i] = productos[i+1];
				}
			}
			�ltimo--;
			cantidad--;
		}
		
	}
	
	private int buscar(int codProducto) {
		int �ndice = -1;
		int i=0;
		while(i <= �ltimo) {
			if (codProducto == productos[i].getCodProducto()) {
				�ndice = i;
				break;
			}
			i++;
		}
		return �ndice;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Producto[] getProductos() {
		return productos;
		//return productos.get();

	}
	
	

}
