package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<String>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		
		//LinkedHashSet = ordem de inserção
		//TreeSet = Ordem alfabetica
		
		
		//for(Object nome: aprovados) {
		//}
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
	}

}
