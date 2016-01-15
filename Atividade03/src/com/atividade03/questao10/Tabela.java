package com.atividade03.questao10;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements CaracterComposto{

	private List<Caracter> caracteres;
	
	public Tabela() {
		this.caracteres = new ArrayList<>();
	}
	
	@Override
	public void imprimir() {
		for(Caracter caracter : caracteres)
			caracter.imprimir();
			
	}

    @Override
	public void adicionar(Caracter caracter) {
		this.caracteres.add(caracter);
		
	}
}
