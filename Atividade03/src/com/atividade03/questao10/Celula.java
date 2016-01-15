package com.atividade03.questao10;

public class Celula implements Caracter {

	private String conteudo;
	
	public Celula(String conteudo){
		this.conteudo = conteudo;
	}
	
	@Override
	public void imprimir() {
		System.out.println(conteudo);
	}

}
