package controle;

import java.util.Scanner;

public class ifelseif {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite sua nota!");
		double nota = key.nextInt();
		
		if( nota >= 9) {
			System.out.println("Quadro de honra");
		} else if(nota >= 7) {
			System.out.println("Aprovado");
		} else if(nota >= 5.5) {
			System.out.println("Recupera��o");
		} else if(nota >= 3.5) {
			System.out.println("Recupera��o + Trabalho");
		} else {
			System.out.println("Reprovado.");
		}
	}

}
