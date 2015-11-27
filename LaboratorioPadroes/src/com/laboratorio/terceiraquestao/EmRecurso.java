package com.laboratorio.terceiraquestao;

public class EmRecurso extends EstadoPadrao {
	
	@Override
	public void designar(Processo processo) {
		processo.setEstadoAtual(new EmAvaliacao());
	}

}
