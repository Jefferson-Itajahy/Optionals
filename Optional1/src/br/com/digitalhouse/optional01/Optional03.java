package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional03 {

	public static void main(String[] args) {

		// Optional<String> vazio3 = Optional.of(null);
		Optional<String> vazio3 = Optional.ofNullable(null);// Usamos quando n�o temos certeza se h� referencia ou
															// n�o... no intuito de n�o lan�ar algo nulo
		String a = vazio3.orElse("Mundo");

		System.out.println(a);
	

	}

}
