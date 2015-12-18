package com.state.questao01;

public class Orcamento {

	private double valorTotal;
	private EstadoOrcamento estado;
	
	public Orcamento() {
		this.estado = EstadoOrcamento.EM_APROVACAO;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void aplicaDesconto(double taxa) {
		this.valorTotal -= this.valorTotal * taxa;
	}

	public void aprovar(){
		this.estado = this.estado.aprovar();
	}
	
	public void reprovar(){
		this.estado = this.estado.reprovar();
	}
	
	public void finalizar(){
		this.estado = this.estado.finalizar();
	}
}
