package com.atividade03.questao05;


public class MediadorNegociacao {
	
	private Vendedor vendedor;

	public void registrarVendedor(Vendedor vendedor){
		this.vendedor = vendedor;
	}
	
	public boolean proporOferta(double valor, UnidadeMonetaria unidade){
		Conversor conversor = vendedor.getUnidadeMonetaria().getConversor();
		double valorConvertido = conversor.converterValor(valor, unidade);
		return this.vendedor.aceita(valorConvertido);
	}

}
