package com.laboratorio.quintaquestao;

public enum TipoCliente {
	ANTIGO(new ClienteAntigo()),
	ANTIGO_E_FREQUENTE(new ClienteAntigoEFrequente()),
	NOVO(new ClienteNovo());
	
	private DescontoStrategy regraDeDesconto;
	
	private TipoCliente(DescontoStrategy tipoDesconto) {
		this.regraDeDesconto = tipoDesconto;
	}
	
	public DescontoStrategy getRegraDeDesconto() {
		return regraDeDesconto;
	}
}
