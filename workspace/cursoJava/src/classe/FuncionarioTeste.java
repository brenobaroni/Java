package classe;

public class FuncionarioTeste {
	

	public static void main(String[] args) {
		
		Funcionario ficha = new Funcionario("Jos�", 1250.50, "Cobrador" );
	
		System.out.println(ficha.format());
		
		System.out.println("Ficha");
		System.out.println("Nome: " + ficha.name);
		System.out.println("Sal�rio: " + ficha.sal);
		System.out.println("Fun��o: " + ficha.func);
	
	}
	

}
