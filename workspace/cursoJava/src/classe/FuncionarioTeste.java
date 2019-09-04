package classe;

public class FuncionarioTeste {
	

	public static void main(String[] args) {
		
		Funcionario ficha = new Funcionario("José", 1250.50, "Cobrador" );
	
		System.out.println(ficha.format());
		
		System.out.println("Ficha");
		System.out.println("Nome: " + ficha.name);
		System.out.println("Salário: " + ficha.sal);
		System.out.println("Função: " + ficha.func);
	
	}
	

}
