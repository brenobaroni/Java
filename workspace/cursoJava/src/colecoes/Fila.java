package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("MAria");
		fila.offer("Jo�o");
		fila.add("Rodiscraition");
		
		System.out.println("Peek/Element... ");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Pool/Remove... ");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		if ( fila.isEmpty() == true) {
			System.out.println("N�o h� pessoas na fila!");
		} else {
			System.out.println("H� Pessoas na fila.");
		}
		
	}

}
