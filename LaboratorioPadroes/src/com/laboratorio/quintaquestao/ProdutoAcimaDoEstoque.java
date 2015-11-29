package com.laboratorio.quintaquestao;

public class ProdutoAcimaDoEstoque implements RegraDeTaxaParaDesconto {

	@Override
	public double getTaxa(Item item) {
		int quantidadeEmEstoque = item.getProduto().getQuantidadeEstoque();
		if(item.getQuantidade() > quantidadeEmEstoque * 0.05)
			return 0.05;
		return 0.015;
	}

	@Override
	public void setProximo(RegraDeTaxaParaDesconto regra) {
	
	}

}
