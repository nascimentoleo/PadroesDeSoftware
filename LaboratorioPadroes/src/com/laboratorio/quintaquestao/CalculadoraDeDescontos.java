package com.laboratorio.quintaquestao;

public class CalculadoraDeDescontos {

	public double calcularDesconto(Cliente cliente, NotaFiscal nota){
		DescontoStrategy regraDeDesconto = cliente.getTipo().getRegraDeDesconto();
		return regraDeDesconto.desconto(cliente, nota);
	}
}
