package com.laboratorio.terceiraquestao;

public class Processo {
	
	private EstadoDeUmProcesso estadoAtual;
	
	public Processo() {
		this.estadoAtual = new Gestacao();
	}
	
	public void setEstadoAtual(EstadoDeUmProcesso estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public String getEstadoAtual(){
		return this.estadoAtual.avisarInteressado();
	}
	
	public void criar(){
		this.estadoAtual.validar(this);
	}
	
	public void designar() {
		this.estadoAtual.designar(this);
	}

	public void deferir() {
		this.estadoAtual.deferir(this);
		
	}

	public void indeferir() {
		this.estadoAtual.indeferir(this);
		
	}

	public void cancelar() {
		this.estadoAtual.cancelar(this);
		
	}
	
	public void finalizar(){
		this.estadoAtual.prazoLegal(this);
	}

}
