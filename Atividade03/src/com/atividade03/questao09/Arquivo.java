package com.atividade03.questao09;

public class Arquivo implements DiretorioSimples {

	private String nome;
	private int tamanho;
	
	public Arquivo(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getTamanho() {
		return tamanho;
	}
	@Override
	public void imprime() {
		System.out.println(nome + " " + tamanho);
		
	}

}
