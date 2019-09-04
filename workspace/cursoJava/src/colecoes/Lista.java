package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("João");
		aprovados.add("Rabanete");
		aprovados.add("Menuel");
		aprovados.add("Rabete");
		
		
		System.out.println("Get... ");
		System.out.println(aprovados.get(1));
		
		System.out.println("Add... ");
		System.out.println(aprovados.add("Rabanete"));
		System.out.println("Size... " + aprovados.size());
		
		System.out.println("Remove... ");
		System.out.println(aprovados.remove("Rabanete"));
		System.out.println(aprovados.size());
		System.out.println(aprovados.remove("Rabanete"));
		System.out.println(aprovados.size());
		System.out.println("Add... ");
		System.out.println(aprovados.add("Rabanete Revenge"));
		
		for(String nome: aprovados ) {
			System.out.println(nome);
		}
	}

}
