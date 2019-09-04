package controle;

import java.util.Scanner;

public class whileDeterminado {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		while(indice < 3) {
			nota = key.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		key.close();
		System.out.printf("A média é %.2f", somaDasNotas / 3);

	}

}
