package controle;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Digite sua nota:");
		double nota = key.nextInt();
		System.out.println("Sua nota foi: " + nota);

		if (nota >= 7) {
			System.out.println("Aprovado!!!");
			System.out.println("Parabéns");
		} else {
			System.out.println("Recuperação!!!");
		}

	}

}
