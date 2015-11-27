package com.laboratorio.terceiraquestao;

public class Gestacao extends EstadoPadrao {

	@Override
	public void validar(Processo processo) {
		processo.setEstadoAtual(new Criado());
	}
	

}
