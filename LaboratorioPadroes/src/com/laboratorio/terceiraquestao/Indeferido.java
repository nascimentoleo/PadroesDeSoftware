package com.laboratorio.terceiraquestao;

public class Indeferido extends EstadoPadrao {
	
	@Override
	public String avisarInteressado() {
		return "Processo indeferido!";
	}
	@Override
	public void designar(Processo processo) {
		processo.setEstadoAtual(new EmRecurso());
	}
	
	@Override
	public void prazoLegal(Processo processo) {
		processo.setEstadoAtual(new Fechado());
	}

}
