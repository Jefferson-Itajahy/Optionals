package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional02 {

	public static void main(String[] args) {
		
		Optional<String> vazio2 = Optional.of("Ol�!");// usado quando temos certeza que contem referencia dentro do
														// optional
		System.out.println(vazio2); // printando o objeto
		System.out.println(vazio2.isPresent()); // verificando se algo est� presente no objeto -> true
		System.out.println(vazio2.isEmpty()); // verificando se o objeto est� vazio -> false

	}

}
