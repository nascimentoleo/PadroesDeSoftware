package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

	public BigDecimal calcularDesconto(Cliente cliente, NotaFiscal nota){
		DescontoStrategy regraDeDesconto = cliente.getTipo().getRegraDeDesconto();
		return regraDeDesconto.desconto(cliente, nota);
	}
}
