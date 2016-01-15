package com.atividade03.questao05;

import java.io.Serializable;

public enum UnidadeMonetaria implements Serializable {
	
	DOLAR(new ConversorDolar()),
	REAL (new ConversorReal()),
	EURO (new ConversorEuro());
	
	private Conversor conversor;
	
	public Conversor getConversor() {
		return this.conversor;
	}
	
	private UnidadeMonetaria(Conversor conversor){
		this.conversor = conversor;
	}
	

}
