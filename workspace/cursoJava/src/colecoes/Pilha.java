package colecoes;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>(); //ArrayDeque
		
		pilha.push("O pequeno meu tarolho.");
		pilha.push("Don meu Saco");
		pilha.push("Minha Rola");
		
		
		System.out.println("Peek... ");
		System.out.println(pilha.peek());
		
		System.out.println("Pop... ");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
	}

}
