package com.atividade03.questao10;

import java.util.ArrayList;
import java.util.List;

public class Linha implements CaracterComposto {

	private List<Caracter> caracteres;
	
	public Linha() {
		caracteres = new ArrayList<>();
	}
	
	@Override
	public void imprimir() {
		System.out.println(" |");
		for(Caracter caracter : caracteres)
			caracter.imprimir();
	}

	@Override
	public void adicionar(Caracter caracter) {
		this.caracteres.add(caracter);

	}

}
