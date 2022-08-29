package br.com.digitalhouse.optional01;

public class Optional09 {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa("Jeff", "JEFF@GMAIL.COM");
		Pessoa p1 = new Pessoa("Jeff", null);
		
		String email = p1
				.getEmail()
				.map(String::toLowerCase)
				.orElse("E-mail não encontrado...");
		
		System.out.println(email);

	}

}
