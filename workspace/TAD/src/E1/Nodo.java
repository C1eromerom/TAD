package E1;

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int i){
		this.dato 		= i;
		this.siguiente	= null; 
	}
	
	public int getDato(){
		return dato;
	}
	
	public Nodo getSiguiente(){
		return siguiente;
	}
	
	public void setDato(int dato){
		this.dato = dato;
	}
	
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
	
	public boolean esIgual(Nodo n){
		return (dato==n.getDato())? true:false;
	}

}
