package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public class Produto {

	private String descricao;
	private int quantidadeEstoque;
	private BigDecimal valorUnitario;
	
	public Produto(String descricao, int quantidadeEstoque, BigDecimal valor) {
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorUnitario = valor;
	}

	public String getDescricao() {
		return descricao;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public BigDecimal valorPorQuantidade(int quantidade){
		return valorUnitario.multiply(new BigDecimal(quantidade));
	}
	
}
