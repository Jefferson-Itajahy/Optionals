package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Optional08 {

	public static void main(String[] args) {
		
		Optional<String> vazio8 = Optional.ofNullable(null);
		vazio8.ifPresentOrElse(System.out::println, () 
				-> System.out.println("Outra Palavra"));//Duas op��es se contem a String ser� impressa, 
														//caso contrario imprime a outra String

	}

}
