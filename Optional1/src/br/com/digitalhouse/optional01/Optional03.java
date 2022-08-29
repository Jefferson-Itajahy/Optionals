package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional03 {

	public static void main(String[] args) {

		// Optional<String> vazio3 = Optional.of(null);
		Optional<String> vazio3 = Optional.ofNullable(null);// Usamos quando não temos certeza se há referencia ou
															// não... no intuito de não lançar algo nulo
		String a = vazio3.orElse("Mundo");

		System.out.println(a);
	

	}

}
