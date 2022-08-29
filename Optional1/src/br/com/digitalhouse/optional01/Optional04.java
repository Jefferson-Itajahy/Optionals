package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional04 {

	public static void main(String[] args) {
	
		//Optional<String> vazio4 = Optional.ofNullable("Olá"); //Optional recebendo um valor String...
		Optional<String> vazio4 = Optional.ofNullable(null); // Optional recebendo valor nulo
		String b = vazio4
				.map(String::toUpperCase) //map --> mapeia -> busca, 1º valor do optional(vazio4), 
										  //se encontra algo vai pegar a String no caso e converter para letras maiusculas.
				.orElse("Mundo"); //Caso o map não encontre, a palavra "Mundo" será lançada

		System.out.println(b);
	}
}
