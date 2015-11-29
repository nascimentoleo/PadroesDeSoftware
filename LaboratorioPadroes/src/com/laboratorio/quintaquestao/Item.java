package com.laboratorio.quintaquestao;


public class Item {

	private Produto produto;
	private double valor;
	private int quantidade;
	
	public Item(Produto produto, double valor, int quantidade) {
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double calculaDesconto(double taxa){
		return this.valor * taxa;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	
}
