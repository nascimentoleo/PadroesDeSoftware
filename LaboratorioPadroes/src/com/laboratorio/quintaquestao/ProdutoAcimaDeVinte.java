package com.laboratorio.quintaquestao;

public class ProdutoAcimaDeVinte implements RegraDeTaxaParaDesconto {

	private RegraDeTaxaParaDesconto proximaRegra;
	@Override
	public double getTaxa(Item item) {
		if(item.getQuantidade() > 20)
			return 0.03;
		return this.proximaRegra.getTaxa(item);

	}
	@Override
	public void setProximo(RegraDeTaxaParaDesconto regra) {
		this.proximaRegra = regra;
	}

}
