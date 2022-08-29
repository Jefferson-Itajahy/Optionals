package br.com.digitalhouse.optional02;

import java.util.Optional;

public class Optional11 {

	public static void main(String[] args) {
		
		//Pessoa p4 = new Pessoa("Jeff", "jeff@gmail.com", new Endereco(new Cidade("Buenos Aires")));
		Pessoa p4 = new Pessoa("Jeff", "jeff@gmail.com", new Endereco(new Cidade(null)));
		//Pessoa -> Endereco(Optional) -> Cidade(Optional) -> nome(String)
		
		Optional<String> nomeCidade = 
		p4.getEndereco()
		.flatMap(Endereco::getCidade)	
		.map(Cidade::getNome);
		
		System.out.println(nomeCidade);
	}

}
