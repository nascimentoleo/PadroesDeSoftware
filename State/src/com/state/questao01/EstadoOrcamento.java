package com.state.questao01;

public enum EstadoOrcamento {
	
	EM_APROVACAO{
		@Override
		void aplicaDesconto(Orcamento orcamento) {
			orcamento.aplicaDesconto(0.05);
		}
		@Override
		EstadoOrcamento aprovar() {
			return APROVADO;
		}
		
		@Override
		EstadoOrcamento reprovar() {
			return REPROVADO;
		}
	}, APROVADO{
		@Override
		void aplicaDesconto(Orcamento orcamento) {
			orcamento.aplicaDesconto(0.02);
		}
		@Override
		EstadoOrcamento finalizar() {
			return FINALIZADO;
		}
		
	}, REPROVADO{
		@Override
		EstadoOrcamento finalizar() {
			return FINALIZADO;
		}
		
	}, FINALIZADO;
	
	void aplicaDesconto(Orcamento orcamento){
		throw new IllegalStateException("Não é possível aplicar desconto");
	}
	
	EstadoOrcamento aprovar(){
		throw new IllegalStateException("Orcamento não pode ser Aprovado");
	}
	
	EstadoOrcamento reprovar(){
		throw new IllegalStateException("Orcamento não pode ser Reprovado");
	}
	
	EstadoOrcamento finalizar(){
		throw new IllegalStateException("Orcamento não pode ser Finalizado");
	}
	
	

}
