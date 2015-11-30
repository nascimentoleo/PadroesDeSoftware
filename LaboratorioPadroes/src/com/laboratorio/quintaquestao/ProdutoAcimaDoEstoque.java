package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public class ProdutoAcimaDoEstoque implements RegraDeTaxaParaDesconto {

	@Override
	public BigDecimal getTaxa(Item item) {
		int quantidadeEmEstoque = item.getProduto().getQuantidadeEstoque();
		if(item.getQuantidade() > quantidadeEmEstoque * 0.05)
			return new BigDecimal(0.05);
		return new BigDecimal(0.015);
	}

	@Override
	public void setProximo(RegraDeTaxaParaDesconto regra) {
	
	}

}
