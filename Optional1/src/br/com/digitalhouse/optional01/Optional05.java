package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional05 {

	public static void main(String[] args) {
		
		Optional<String> vazio5 = Optional.ofNullable(null);
		
		String c = vazio5
				.map(String::toUpperCase) //map --> mapeia -> busca, 1� valor do optional(vazio4), 
				  						  //se estiver presente vai pegar a String e converter para letras maiusculas.
				.orElseGet(() -> { //Caso precise usar l�gica para recuperar o valor... 
								   //recuperar um m�todo... uma opera��o pesada etc...
			return "Mundo"; // Se n�o houve o uso de l�gica com orElseGet --> retorna a String
		});

		System.out.println(c);
	}

}
