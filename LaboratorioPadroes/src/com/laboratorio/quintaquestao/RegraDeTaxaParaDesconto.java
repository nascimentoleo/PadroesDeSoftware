package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public interface RegraDeTaxaParaDesconto {

	public BigDecimal getTaxa(Item item);
	public void setProximo(RegraDeTaxaParaDesconto regra);
}
