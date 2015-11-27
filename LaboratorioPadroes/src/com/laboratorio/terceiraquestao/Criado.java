package com.laboratorio.terceiraquestao;

public class Criado extends EstadoPadrao {

	@Override
	public String avisarInteressado() {
		return "Processo Criado!";
	}
	@Override
	public void designar(Processo processo) {
		processo.setEstadoAtual(new EmAvaliacao());
	}
	
	@Override
	public void cancelar(Processo processo) {
		processo.setEstadoAtual(new Fechado());
	}
	
	
	

}
