package com.laboratorio.terceiraquestao;

public class EmAvaliacao extends EstadoPadrao {

	@Override
	public String avisarInteressado() {
		return "Processo Em Avaliacao!";
	}
	
	@Override
	public void deferir(Processo processo) {
	    processo.setEstadoAtual(new Deferido());
	}
	
	@Override
	public void indeferir(Processo processo) {
		processo.setEstadoAtual(new Indeferido());
	}
	
	

}
