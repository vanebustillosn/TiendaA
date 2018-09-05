package categor�a.control;

import java.util.ArrayList;

import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;

public class Categor�as {

	private Categor�a[] categor�as;
	private int cantidad;
	private int �ltimo;

	public Categor�as(int tama�o) {
		categor�as = new Categor�a[tama�o];
		//ArrayList<Categor�a> categor�as= new ArrayList<Categor�a>();
		cantidad = 0;
		�ltimo = -1;
	}

	/****************************
	 * Ingresar una Categor�a    *
	 ****************************/
	
	public void ingresar(Categor�a Categor�a) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		categor�as[++�ltimo] = Categor�a;
		//categor�as.add(�ltimo);
		cantidad++;
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	
	
	public int getCantidad() {
		return cantidad;
	//return 	categor�as.length;
	}
	

	/****************************
	 * Eliminar una Categor�a     
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void eliminar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice;
		�ndice = buscar(codCategor�a);

	
			if (�ndice != �ltimo) {
				for (int i = �ndice; i <= �ltimo; i++) {
					categor�as[i] = categor�as[i + 1];
				}
			}
			�ltimo--;
			cantidad--;
		
	}
	
	
	/****************************
	 * Buscar  �ndice	 		*
	 *  Categor�a     			
	 * @throws NoExisteCategor�a *
	 ****************************/

	public int buscar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice = -1;
		for (int i = 0; i <= �ltimo; i++) {
			if (codCategor�a == categor�as[i].getCodCategor�a()) {
				�ndice = i;
			}
		}
		if (�ndice== -1) {
			throw new NoExisteCategor�a();
		}
			return �ndice;
	}
	
	/****************************
	 * Veroficar  c�digo 		*
	 *  Categor�a     			
	 * @throws NoExisteCategor�a *
	 ****************************/

	public boolean searchBoolean(int codCategor�a) throws NoExisteCategor�a {
		boolean valor = false;
				
		for (int i = 0; i <= �ltimo; i++) {
			if (codCategor�a == categor�as[i].getCodCategor�a()) {
				valor  = !valor;
			}
		}
		if (valor== false) {
			throw new NoExisteCategor�a();
		}
			return valor;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * Categor�as                *
	 ****************************/

	public Categor�a[] getCategor�as() {
		return categor�as; // listado de todas las categor�as existentes
		//return categor�as.get();
	}
	
	
}
