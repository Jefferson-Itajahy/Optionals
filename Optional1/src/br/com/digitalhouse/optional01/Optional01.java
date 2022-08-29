package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {
		
		Optional<String> vazio = Optional.empty(); // Instanciando um objeto optional

		System.out.println(vazio); // printando o objeto
		System.out.println(vazio.isPresent()); // metodo que verifica se algo está presente no objeto -> false
		System.out.println(vazio.isEmpty()); // metodo que verifica se o objeto está vazio -> true

	}

}
