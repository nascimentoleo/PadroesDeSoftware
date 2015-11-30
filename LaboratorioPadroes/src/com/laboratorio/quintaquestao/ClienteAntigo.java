package com.laboratorio.quintaquestao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClienteAntigo implements DescontoStrategy {

	@Override
	public BigDecimal desconto(Cliente cliente, NotaFiscal nota) {
		BigDecimal totalDesconto = new BigDecimal(0);
		BigDecimal descontoPorAnos = this.getDescontoPorAnos(cliente.getAnos());
		for(Item item : nota.getItems()){
			totalDesconto = totalDesconto.add(item.calculaDesconto(new BigDecimal("0.02")));
			totalDesconto = totalDesconto.add(item.calculaDesconto(descontoPorAnos));
		}
		return totalDesconto.setScale(2,RoundingMode.HALF_EVEN);
	}
		
	private BigDecimal getDescontoPorAnos(int anos){
		if(anos < 8)
			return new BigDecimal(anos * 0.0012);
		return new BigDecimal("0.01");
	}

}
