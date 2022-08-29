package br.com.digitalhouse.optional02;

import java.util.Optional;

public class Endereco {
	
	private Cidade cidade;
	
	public Endereco(Cidade cidade) {
		this.cidade = cidade;
	}

	public Optional<Cidade> getCidade() {
		return Optional.ofNullable(cidade);
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
