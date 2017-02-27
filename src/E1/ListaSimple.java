package E1;

public class ListaSimple {
	private Nodo inicio;
	private int tamaño;
	
	public ListaSimple(){
		inicio = null;
		tamaño = 0;
	}
	
	public Nodo getInicio(){
		return inicio;
	}
	
	public int getTamaño(){
		return tamaño;
	}
	
	public void setInicio(Nodo inicio){
		this.inicio = inicio;
	}
	
	public void setTamaño(int tamaño){
		this.tamaño = tamaño;
	}
	
	public String toString(){
		String salida = "La lista contiene: ";
		Nodo auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamaño + " elementos";
		return salida;
	}
	
	public void insertarInicio(Nodo nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamaño++;
	}
	
	public void insertarFinal(Nodo nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			Nodo aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamaño++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,Nodo nodo){
		if(posicion<0 || posicion>tamaño) return false;
		else{
			Nodo aux = inicio;
			if(posicion==0){
				insertarInicio(nodo);
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				nodo.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(nodo);
				tamaño++;
				return true;
			}
			
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			Nodo aux = inicio;
			inicio = aux.getSiguiente();
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			Nodo aux = inicio;
			while(i<tamaño-2){
				aux=aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(null);
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tamaño) return false;
		else{
			Nodo aux = inicio;
			Nodo aux2 = inicio;
			if(posicion==0){
				eliminarPrimero();
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				for(int i=0;i<posicion+1;i++){
					aux2 = aux2.getSiguiente();
			
				}
				aux.setSiguiente(aux2);
				tamaño--;
				return true;
			}
			
		}
	}
	
	public int buscarPrimero(Nodo i){
		Nodo aux = inicio;
		int posicion=1;
		boolean encontrado=false;
		while(aux!=null && !encontrado){
			if(aux.esIgual(i)){
				encontrado=true;
			}else{
				aux=aux.getSiguiente();
				posicion++;
			}
		}
		return posicion;
	}
	
	public ListaSimple buscarTodos(Nodo n) {
		Nodo auxiliar = this.inicio;
		ListaSimple resultado = new ListaSimple();
		int posicion = 1;

		while (auxiliar != null) {
			if (auxiliar.esIgual(n)) {
				resultado.insertarInicio(new Nodo(posicion));
			}
			auxiliar = auxiliar.getSiguiente();
			posicion++;

		}
		return resultado;

	}
	
	public void eliminarTodos(Nodo n){
		
		Nodo aux = buscarTodos(n).getInicio();
		while(aux!=null){
			eliminarPosicion(aux.getDato());
			aux=aux.getSiguiente();
		}
	}
}


