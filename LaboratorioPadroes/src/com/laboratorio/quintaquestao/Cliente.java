package com.laboratorio.quintaquestao;

public class Cliente {

	private int anos;
	private TipoCliente tipo;
	
	public Cliente(TipoCliente tipo, int anos) {
		this.anos = anos;
		this.tipo = tipo;
	}
	
	public int getAnos() {
		return anos;
	}
	
	public TipoCliente getTipo() {
		return tipo;
	}
}
