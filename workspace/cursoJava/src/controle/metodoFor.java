package controle;

import java.util.Scanner;

public class metodoFor {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int countNotas = 0;
		System.out.println("Quantas notas o aluno terá ?");
		countNotas = key.nextInt();
		
		for(int index = 0; index < countNotas; index++) {
			nota = key.nextDouble();
			somaDasNotas += nota;	
		}
		key.close();
		System.out.printf("A média é %.2f", somaDasNotas / countNotas);
		
	}

}
