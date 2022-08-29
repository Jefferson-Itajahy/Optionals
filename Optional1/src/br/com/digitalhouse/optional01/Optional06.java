package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional06 {

	public static void main(String[] args) {

		Optional<String> vazio6 = Optional.ofNullable(null);
		String d = vazio6
				.map(String::toUpperCase)
				.orElseThrow(IllegalArgumentException::new); // Caso precise lançar uma exceção

		System.out.println(d);
		
		
	}
}
