package E1;
import miLibreria.Entrada;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		ListaSimple lista = new ListaSimple();
		Nodo a = new Nodo(1);
		lista.setInicio(a);
		lista.setTamaño(lista.getTamaño()+1);
		
		Nodo b = new Nodo(2);
		lista.getInicio().setSiguiente(b);
		lista.setTamaño(lista.getTamaño()+1);
		
		Nodo c = new Nodo(3);
		lista.getInicio().getSiguiente().setSiguiente(c);
		lista.setTamaño(lista.getTamaño()+1);
		
		Nodo d = new Nodo(2);
		lista.getInicio().getSiguiente().getSiguiente().setSiguiente(d);
		lista.setTamaño(lista.getTamaño()+1);
		
		Nodo e = new Nodo(5);
		lista.getInicio().getSiguiente().getSiguiente().getSiguiente().setSiguiente(e);
		lista.setTamaño(lista.getTamaño()+1);
		
		lista.insertarInicio(new Nodo(0));
		lista.insertarFinal(new Nodo(4));
		
		System.out.println(lista.toString());
		
		lista.insertarPosicion(3, new Nodo(9));
		System.out.println(lista.toString());
		System.out.println("Eliminar primero--");
		lista.eliminarPrimero();
		System.out.println(lista.toString());
		System.out.println("Eliminar ultimo");
		lista.eliminarUltimo();
		System.out.println(lista.toString());
		lista.eliminarPosicion(3);
		System.out.println(lista.toString());
		System.out.println(lista.buscarPrimero(new Nodo(2)));
		System.out.println(lista.buscarTodos(new Nodo(2)));

	}

}
