package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional07 {

	public static void main(String[] args) {
		
		Optional<String> vazio7 = Optional.ofNullable(null);
		vazio7.ifPresent(word -> {System.out.println(word); // Se presente a String será adicionada 
															// a variavel word e printada em seguida
		});
	}
}
