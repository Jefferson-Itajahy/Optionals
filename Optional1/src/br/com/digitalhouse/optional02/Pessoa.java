package br.com.digitalhouse.optional02;

import java.util.Optional;

public class Pessoa {
	
	private final String nome;
	private final String email;
	private Endereco endereco;
	
	public Pessoa(String nome, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	
	public Optional<Endereco> getEndereco() {
		return Optional.ofNullable(endereco);
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
