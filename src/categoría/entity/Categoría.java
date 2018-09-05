package categoría.entity;

public class Categoría {
	
	private int codCategoría;
	private String nombre;
	private String descripción;
	
	public Categoría(int codCategoría, String nombre, String descripción) {
		this.codCategoría = codCategoría;
		this.nombre = nombre;
		this.descripción = descripción;
	}

	public int getCodCategoría() {
		return codCategoría;  //devuelve el cod de la categoria
	}

	public void setCodCategoría(int codCategoría) {
		this.codCategoría = codCategoría;
	}

	public String getNombre() {
		return nombre; // devuelve el nombre de la categoria
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción; // devuelve la descripcon de la descripcion
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	@Override
	public String toString() {
		return "Categoría [codCategoría=" + codCategoría + ", nombre=" + nombre + ", descripción=" + descripción + "]";
	// devuelve esta información al seleccionar "listar categorias"
	}

	
	
	

}
