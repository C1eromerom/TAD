package Libros;

public class ListaSimple {
	private NodoLibro inicio;
	private int tamaño;

	public ListaSimple() {
		inicio = null;
		tamaño = 0;
	}

	public NodoLibro getInicio() {
		return inicio;
	}

	public void setInicio(NodoLibro inicio) {
		this.inicio = inicio;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String toString() {
		String salida = "La lista contiene: \n";
		NodoLibro auxiliar = inicio;
		while (auxiliar != null) {
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa libreria tiene " + tamaño + " libros";
		return salida;
	}

	public void insertarInicio(NodoLibro n) {
		n.setSiguiente(inicio);
		inicio = n;
		tamaño++;

	}

	public void insertarFinal(NodoLibro nodo) {
		if (inicio == null)
			insertarInicio(nodo);
		else {
			NodoLibro actual = inicio;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nodo);
			this.tamaño++;
		}
	}

	public boolean insertar(NodoLibro nodo, int posicion) {
		if (posicion > this.tamaño + 1 || posicion < 1) {
			return false;
		} else {
			if (posicion == 1)
				insertarInicio(nodo);
			else if (posicion == tamaño + 1)
				insertarFinal(nodo);
			else {
				NodoLibro nodoAuxiliar = inicio.getSiguiente();
				NodoLibro nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAuxiliar;
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicion--;
				}
				nodo.setSiguiente(nodoAuxiliar);
				nodoAnterior.setSiguiente(nodo);
				this.tamaño++;
			}
			return true;
		}
	}

	public boolean eliminarPrimero() {
		if (inicio == null)
			return false;
		else {
			inicio = inicio.getSiguiente();
			tamaño--;
			return true;
		}
	}

	public boolean eliminarUltimo() {
		if (inicio == null)
			return false;
		else {
			if (tamaño == 1)
				inicio = null;
			else {
				NodoLibro nodoAuxiliar = inicio;
				int posicionAuxiliar = 1;
				while (posicionAuxiliar < this.tamaño - 1) {
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicionAuxiliar++;
				}
				nodoAuxiliar.setSiguiente(null);
			}
			tamaño--;
			return true;
		}

	}

	public boolean eliminar(int posicion) {
		if (posicion <= 0 || posicion > tamaño)
			return false;
		else {
			if (posicion == 1)
				return eliminarPrimero();
			else {
				NodoLibro nodoAEliminar = inicio.getSiguiente();
				NodoLibro nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAEliminar;
					nodoAEliminar = nodoAEliminar.getSiguiente();
					posicion--;
				}
				nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
				this.tamaño--;
				return true;
			}
		}
	}

	public boolean esVacia() {
		return (tamaño == 0) ? true : false;
	}

	public int buscarPrimero(NodoLibro n) {
		NodoLibro auxiliar = this.inicio;
		int posicion = 1;
		boolean encontrado = false;
		while (auxiliar != null && !encontrado) {
			if (auxiliar.esIgual(n)) {
				encontrado = true;
			} else {
				auxiliar = auxiliar.getSiguiente();
				posicion++;
			}
		}
		return (auxiliar == null) ? 0 : posicion;

	}
	public NodoLibro obtenerNodoLibro(int posicion){
		NodoLibro auxiliar=inicio;
		posicion--;
		while(posicion>0){
			auxiliar=auxiliar.getSiguiente();
			posicion--;
		}
		return auxiliar;
	}

}
