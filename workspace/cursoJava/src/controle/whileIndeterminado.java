package controle;

import java.util.Scanner;

public class whileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		while (nota != -1 ) {
			nota = key.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		}
		key.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas / numeroDeNotas);
		
		
	}

}
