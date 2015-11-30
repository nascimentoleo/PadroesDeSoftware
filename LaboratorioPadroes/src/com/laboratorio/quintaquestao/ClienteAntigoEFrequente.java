package com.laboratorio.quintaquestao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClienteAntigoEFrequente implements DescontoStrategy {

	private RegraDeTaxaParaDesconto regra;
	
	public ClienteAntigoEFrequente() {
		regra = new ProdutoAcimaDeVinte();
		regra.setProximo(new ProdutoAcimaDoEstoque());
	}
	
	
	@Override
	public BigDecimal desconto(Cliente cliente, NotaFiscal nota) {
		BigDecimal totalDesconto = new BigDecimal(0);
		for(Item item : nota.getItems())
			totalDesconto = totalDesconto.add(item.calculaDesconto(regra.getTaxa(item)));
		
		return totalDesconto.setScale(2,RoundingMode.HALF_EVEN);
	}
	

}
