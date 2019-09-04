package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String faixa = "preta";
		
		System.out.println("Qual faixa voce é ?");
		faixa = key.nextLine();
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("golpe 1");
		case "marrom":
			System.out.println("golpe 2");
		case "roxa":
			System.out.println("golpe 3");
		case "verde":
			System.out.println("golpe 4");
		case "laranja":
			System.out.println("golpe 5");
		case "vermelha":
			System.out.println("golpe 6");
		case "amarela":
			System.out.println("golpe 7");
		default:
			System.out.println("Faixa não encontrada.");
		}
		
	}

}
