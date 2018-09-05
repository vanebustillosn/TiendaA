package producto.entity;

public class Producto {
	
	private int codProducto;
	private String nombre;
	private double precio;
	private String descripci�n;
	private int codCategor�a;
	
	public Producto(int codProducto, String nombre, double precio, String descripci�n, int codCategor�a) {
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.descripci�n = descripci�n;
		this.codCategor�a = codCategor�a;
	}

	public int getCodProducto() {
		return codProducto; // devuelve el cod del producto
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre; // devuelve el nombre del producto
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio; // devuelve el precio del producto
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripci�n() {
		return descripci�n; // devuelve la descripcion del producto
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public int getCodCategor�a() {
		return codCategor�a; // devuelve el cod de la categoria a la que pertenece el producto
	}

	public void setCodCategor�a(int codCategor�a) {
		this.codCategor�a = codCategor�a;
	}

	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", nombre=" + nombre + ", precio=" + precio + ", descripci�n="
				+ descripci�n + ", codCategor�a=" + codCategor�a + "]";
	}
	
	
	
	

}
