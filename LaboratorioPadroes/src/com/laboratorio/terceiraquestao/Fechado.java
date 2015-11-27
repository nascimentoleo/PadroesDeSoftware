package com.laboratorio.terceiraquestao;

public class Fechado extends EstadoPadrao {

	@Override
	public String avisarInteressado() {
		return "Processo Fechado!";
	}

}
