package com.atividade03.questao09;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements DiretorioComposto{

	private List<Diretorio> subDiretorios;
	private String nome;
	
	public Pasta(String nome) {
		this.subDiretorios = new ArrayList<>();
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public List<Diretorio> getDiretorios() {
		return subDiretorios;
	}

	@Override
	public void addDiretorio(Diretorio novo) {
		this.subDiretorios.add(novo);
		
	}

	@Override
	public void imprime() {
		System.out.println(nome);
		for(Diretorio dir : subDiretorios)
			dir.imprime();
		
	}



	


}
