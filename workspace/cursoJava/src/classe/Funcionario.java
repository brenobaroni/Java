package classe;

public class Funcionario {
	
	String name;
	double sal;
	String func;
	
	
	Funcionario (String n, double s, String f) {
		name = n;
		sal = s;
		func = f;
	}
	
	String format() {
		return String.format("Ficha:" + "\nNome: "+ name + "\nSal�rio: "+ sal + "\nFun��o: " + func);
		
	}

}
