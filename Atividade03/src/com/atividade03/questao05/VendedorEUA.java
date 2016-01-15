package com.atividade03.questao05;

public class VendedorEUA implements Vendedor {

	@Override
	public UnidadeMonetaria getUnidadeMonetaria() {
		return UnidadeMonetaria.DOLAR;
	}

	@Override
	public boolean aceita(double valor) {
		if(valor >= 50)
			return true;
		return false;
	}

}
