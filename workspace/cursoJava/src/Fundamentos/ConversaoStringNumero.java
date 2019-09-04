package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String resp1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resp2 = JOptionPane.showInputDialog("Whats the respost two?");
		
		System.out.println(resp1 + resp2);
		
		
		//Converter string em double
		
		double nota1 = Double.parseDouble(resp1);
		double nota2 = Double.parseDouble(resp2);
		double total = nota1  + nota2;
		
		System.out.println(total / 2);
		
		
		
	}

}
