package listaDoblementeEnlazada;

public class Nodo {
	private int dato;
	private Nodo derecha;
	private Nodo izquierda;
	
	public Nodo (int dato){
		this.dato=dato;
		this.derecha=null;
		this.izquierda=null;
	}

	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	public String toString() {
		return  dato+",";
	}

	

}
