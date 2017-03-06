package listaDoblementeEnlazada;


public class ListaDoblementeEnlazada {
	private Nodo cabeza;
	private Nodo cola;
	private int tamaño;
	
	public ListaDoblementeEnlazada(){
		cabeza=null;
		cola=null;
		tamaño=0;
	}
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public Nodo getCola() {
		return cola;
	}
	public void setCola(Nodo cola) {
		this.cola = cola;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public String toString() {
		String salida = tamaño + " elementos\n";
		Nodo auxiliar = cabeza;
		while (auxiliar != null) {
			salida = salida + auxiliar.toString() + "";
			auxiliar = auxiliar.getDerecha();
		}
		return salida;
	}
	
	public String toString2() {
		String salida = tamaño + " elementos\n";
		Nodo auxiliar = cola;
		while (auxiliar != null) {
			salida = salida + auxiliar.toString() + "";
			auxiliar = auxiliar.getIzquierda();
		}
		return salida;
	}
	
	public void insertarCabeza(Nodo n) {
		if(cabeza == null){
			cabeza=n;
			cola=n;
			tamaño++;
		}else{
		n.setDerecha(cabeza);
		cabeza.setIzquierda(n);
		cabeza = n;
		tamaño++;
		}
	}
	
	public void insertarFinal(Nodo nodo) {
		if(cola == null){
			cabeza=nodo;
			cola=nodo;
			tamaño++;
		}else{
		nodo.setIzquierda(cola);
		cola.setDerecha(nodo);
		cola = nodo;
		tamaño++;
		}
	}
	
	public boolean insertar(Nodo nodo, int posicion) {
		if (posicion > this.tamaño + 1 || posicion < 1) {
			return false;
		} else {
			if (posicion == 1)
				insertarCabeza(nodo);
			else if (posicion == tamaño + 1)
				insertarFinal(nodo);
			else {
				Nodo nodoAuxiliar = cabeza.getDerecha();
				Nodo nodoAnterior = cabeza;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAuxiliar;
					nodoAuxiliar = nodoAuxiliar.getDerecha();
					posicion--;
				}
				nodo.setDerecha(nodoAuxiliar);
				nodoAuxiliar.setIzquierda(nodo);
				nodoAnterior.setDerecha(nodo);
				nodo.setIzquierda(nodoAnterior);
				this.tamaño++;
			}
			return true;
		}
	}
	public boolean eliminarPrimero() {
		if (cabeza == null)
			return false;
		else {
			cabeza = cabeza.getDerecha();
			cabeza.setIzquierda(null);
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarUltimo() {
		if (cola == null)
			return false;
		else {
			cola = cola.getIzquierda();
			cola.setDerecha(null);
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
				Nodo nodoAEliminar = cabeza.getDerecha();
				Nodo nodoAnterior = cabeza;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAEliminar;
					nodoAEliminar = nodoAEliminar.getDerecha();
					posicion--;
				}
				nodoAnterior.setDerecha(nodoAEliminar.getDerecha());
				nodoAEliminar.getDerecha().setIzquierda(nodoAnterior);
				this.tamaño--;
				return true;
			}
		}
	}
	
	public boolean esVacia() {
		return (tamaño == 0) ? true : false;
	}

}
