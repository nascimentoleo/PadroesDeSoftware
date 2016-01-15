package com.atividade03.questao05;

public class CompradorBrasil implements Comprador {

	@Override
	public boolean proporValor(MediadorNegociacao mediador, double valor) {
		return mediador.proporOferta(valor, UnidadeMonetaria.REAL);
	}
				

}
