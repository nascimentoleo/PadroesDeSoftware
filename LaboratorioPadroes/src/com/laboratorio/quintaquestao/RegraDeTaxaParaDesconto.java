package com.laboratorio.quintaquestao;

public interface RegraDeTaxaParaDesconto {

	public double getTaxa(Item item);
	public void setProximo(RegraDeTaxaParaDesconto regra);
}
