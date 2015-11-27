package com.laboratorio.terceiraquestao;

public class Deferido extends EstadoPadrao {
	
	@Override
	public String avisarInteressado() {
		return "Processo Deferido!";
	}
	@Override
	public void prazoLegal(Processo processo) {
		processo.setEstadoAtual(new Fechado());
	}

}
