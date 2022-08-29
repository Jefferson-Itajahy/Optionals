package br.com.digitalhouse.optional01;

import java.util.Optional;

public class Pessoa {
	
	private final String nome;
	private final String email;
	
	
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}
