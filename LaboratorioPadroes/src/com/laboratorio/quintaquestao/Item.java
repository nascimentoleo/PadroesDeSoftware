package com.laboratorio.quintaquestao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {

	private Produto produto;
	private BigDecimal valor;
	private int quantidade;
	
	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.valor = produto.valorPorQuantidade(quantidade);
		this.quantidade = quantidade;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public BigDecimal calculaDesconto(BigDecimal taxa){
		return this.valor.multiply(taxa);
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	
}
