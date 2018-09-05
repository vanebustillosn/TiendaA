package categor�a.entity;

public class Categor�a {
	
	private int codCategor�a;
	private String nombre;
	private String descripci�n;
	
	public Categor�a(int codCategor�a, String nombre, String descripci�n) {
		this.codCategor�a = codCategor�a;
		this.nombre = nombre;
		this.descripci�n = descripci�n;
	}

	public int getCodCategor�a() {
		return codCategor�a;  //devuelve el cod de la categoria
	}

	public void setCodCategor�a(int codCategor�a) {
		this.codCategor�a = codCategor�a;
	}

	public String getNombre() {
		return nombre; // devuelve el nombre de la categoria
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripci�n() {
		return descripci�n; // devuelve la descripcon de la descripcion
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	@Override
	public String toString() {
		return "Categor�a [codCategor�a=" + codCategor�a + ", nombre=" + nombre + ", descripci�n=" + descripci�n + "]";
	// devuelve esta informaci�n al seleccionar "listar categorias"
	}

	
	
	

}
