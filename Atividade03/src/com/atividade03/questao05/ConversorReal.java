package com.atividade03.questao05;

import java.util.EnumMap;
import java.util.Map;

public class ConversorReal implements Conversor {

	private Map<UnidadeMonetaria, Double> mapaValores;

	public ConversorReal() {
		mapaValores = new EnumMap<>(UnidadeMonetaria.class);
		mapaValores.put(UnidadeMonetaria.EURO, new Double(0.22));
		mapaValores.put(UnidadeMonetaria.DOLAR, new Double(0.24));
	}

	@Override
	public double converterValor(double valor, UnidadeMonetaria novaUnidadeMonetaria) {
		return valor * this.mapaValores.get(novaUnidadeMonetaria);
	}


}
