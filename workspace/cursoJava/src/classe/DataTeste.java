package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data nascimento = new Data(19, 11, 1987 );
		//nascimento.dia = 19;
		//nascimento.mes = 11;
		//nascimento.ano = 1987;
		
		Data casamento = new Data();
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
	}

}
