package Api;

public class ExplorandoString {
	
	public static void main(String[] args) {
		String nome = new String("Leonardo");
		nome = "Leo" + "nardo";
		
		//Alguns Metodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("Leo"));
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal!").concat("!"));
		
		// A stirng � imutavel
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0, 3).concat(" � legal!!");
		System.out.println(nome);
	}

}
