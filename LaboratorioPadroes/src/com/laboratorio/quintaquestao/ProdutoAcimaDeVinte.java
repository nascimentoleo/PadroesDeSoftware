package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public class ProdutoAcimaDeVinte implements RegraDeTaxaParaDesconto {

	private RegraDeTaxaParaDesconto proximaRegra;
	
	@Override
	public BigDecimal getTaxa(Item item) {
		if(item.getQuantidade() > 20)
			return new BigDecimal(0.03);
		return this.proximaRegra.getTaxa(item);

	}
	@Override
	public void setProximo(RegraDeTaxaParaDesconto regra) {
		this.proximaRegra = regra;
	}

}
