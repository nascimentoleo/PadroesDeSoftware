package com.atividade03.questao05;

import java.util.EnumMap;
import java.util.Map;

public class ConversorDolar implements Conversor {

	enum teste{
		TESTE;
	}
	private Map<teste, Double> mapaValores;
		
	public ConversorDolar() {
		this.mapaValores = new EnumMap<>(teste.class);
		//mapaValores.put(UnidadeMonetaria.REAL, 4.04);
		//mapaValores.put(UnidadeMonetaria.EURO, 0.91);
	}
	
	@Override
	public double converterValor(double valor , UnidadeMonetaria novaUnidadeMonetaria)  {
		Double d = this.mapaValores.get(UnidadeMonetaria.EURO);
		return valor * this.mapaValores.get(novaUnidadeMonetaria);
	}

	
	
	
	
	
	

}
