package com.laboratorio.quintaquestao;

public class Produto {

	private String descricao;
	private int quantidadeEstoque;
	
	public Produto(String descricao, int quantidadeEstoque) {
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getDescricao() {
		return descricao;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
}
