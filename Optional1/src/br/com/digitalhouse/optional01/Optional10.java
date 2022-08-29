package br.com.digitalhouse.optional01;

public class Optional10 {

	public static void main(String[] args) {

		Pessoa p2 = new Pessoa("Jeff", "JEFF@GMAIL.COM");
		//Pessoa p2 = new Pessoa("Jeff", null);
				
		if(p2.getEmail().isPresent()) {
			String email = p2.getEmail().get();
			System.out.println(email.toLowerCase());
		} else {
			System.out.println("E-mail não encontrado...");
		}		
	}
}
