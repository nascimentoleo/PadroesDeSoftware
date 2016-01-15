package com.atividade03.questao05;

public class CompradorFranca implements Comprador {

	@Override
	public boolean proporValor( MediadorNegociacao mediador, double valor) {
		return mediador.proporOferta(valor, UnidadeMonetaria.EURO);
	}

}
