package com.laboratorio.quintaquestao;

import java.math.BigDecimal;

public interface DescontoStrategy {
	
	public BigDecimal desconto(Cliente cliente, NotaFiscal nota);

}
