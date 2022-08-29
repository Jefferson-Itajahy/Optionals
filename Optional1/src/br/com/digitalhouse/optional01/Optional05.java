package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional05 {

	public static void main(String[] args) {
		
		Optional<String> vazio5 = Optional.ofNullable(null);
		
		String c = vazio5
				.map(String::toUpperCase) //map --> mapeia -> busca, 1º valor do optional(vazio4), 
				  						  //se estiver presente vai pegar a String e converter para letras maiusculas.
				.orElseGet(() -> { //Caso precise usar lógica para recuperar o valor... 
								   //recuperar um método... uma operação pesada etc...
			return "Mundo"; // Se não houve o uso de lógica com orElseGet --> retorna a String
		});

		System.out.println(c);
	}

}
