package com.laboratorio.terceiraquestao;

public abstract class EstadoPadrao implements EstadoDeUmProcesso {

	@Override
	public String avisarInteressado() {
		return null;
	}
	
	@Override
	public void validar(Processo processo) {
		throw new RuntimeException("Não é possível validar o processo");
	}

	@Override
	public void cancelar(Processo processo) {
		throw new RuntimeException("Não é possível cancelar o processo");
	}

	@Override
	public void designar(Processo processo) {
		throw new RuntimeException("Não é possível designar o processo");

	}

	@Override
	public void indeferir(Processo processo) {
		throw new RuntimeException("Não é possível deferir o processo");

	}

	@Override
	public void deferir(Processo processo) {
		throw new RuntimeException("Não é possível indeferir o processo");

	}

	@Override
	public void prazoLegal(Processo processo) {
		throw new RuntimeException("Não é possível fechar o processo");

	}

}
