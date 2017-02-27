package listaDoblementeEnlazada;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
		Nodo a = new Nodo(1);
	
		
		Nodo b = new Nodo(2);
		
		Nodo c = new Nodo(3);
		
		Nodo d = new Nodo(4);
		
		Nodo e = new Nodo(5);
		lista.insertarCabeza(a);
		lista.insertarCabeza(b);
		lista.insertarCabeza(c);
		lista.insertarCabeza(d);
		lista.insertarCabeza(e);
		System.out.println(lista.toString());
		lista.insertarFinal(new Nodo(0));
		System.out.print("Insertar final\n");
		System.out.println(lista.toString());
		
		lista.insertar(new Nodo(3),3);
		System.out.print("Insertar nodo \"3\" en posición 3\n");
		System.out.println(lista.toString());
		
		lista.eliminarPrimero();
		System.out.print("Eliminar Primero\n");
		System.out.println(lista.toString());
		
		lista.eliminarUltimo();
		System.out.print("Eliminar ultimo\n");
		System.out.println(lista.toString());
		
		lista.eliminar(3);
		System.out.print("Eliminar posición 3\n");
		System.out.println(lista.toString());
		
		System.out.print("Lista invertida\n");
		System.out.println(lista.toString2());
	

	}

}
