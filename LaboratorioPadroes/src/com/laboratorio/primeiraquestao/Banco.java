package com.laboratorio.primeiraquestao;

import java.util.Date;

public class Banco {

	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
	public Banco(String nome, String telefone, String endereco, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getEmail() {
		return this.email;
	}

}
