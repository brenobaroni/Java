package Fundamentos;

public class OperadoresLogicos {
	
	
	public static void main(String[] args) {
		boolean execTrab01 = false;
		boolean execTrab02 = false;
		
		boolean buyIcecream = execTrab01 || execTrab02;
		boolean buyTv50 = execTrab01 && execTrab02;
		boolean buyTv32 = execTrab01 ^ execTrab02;
		
		if (buyIcecream == true) {
			System.out.println("Voc� comprar� sorvete!");
		} else {
			System.out.println("Voc� n�o Comprar� sorvete! Vai nem sair de casa ot�rio.");
		}
		
		if ( buyTv50 == true) {
			System.out.println("Voc� comprar� uma TV de 50'");
		} else {
			System.out.println("Voc� n�o comprar� uma TV de 50'");
		}
		
		if (buyTv32 == true) {
			System.out.println("Voc� comprar� uma TV de 32'");
		} else {
			System.out.println("Voc� n�o comprar� uma de TV de 32'");
		}
		
		
	}

}