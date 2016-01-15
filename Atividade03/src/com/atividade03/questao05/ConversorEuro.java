package com.atividade03.questao05;

import java.util.EnumMap;

public class ConversorEuro implements Conversor {

	private EnumMap<UnidadeMonetaria, Double> mapaValores;

	public ConversorEuro() {
		mapaValores = new EnumMap<>(UnidadeMonetaria.class);
		mapaValores.put(UnidadeMonetaria.REAL, new Double(4.41));
		mapaValores.put(UnidadeMonetaria.DOLAR, new Double(1.09));
	}

	@Override
	public double converterValor(double valor, UnidadeMonetaria novaUnidadeMonetaria) {
		return valor * this.mapaValores.get(novaUnidadeMonetaria);
	}

}
