package com.decorator.questao01;

public class ImpostoICPP extends ImpostoDecorator {

	public ImpostoICPP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImpostoICPP(Imposto impostoDecorado) {
		super(impostoDecorado);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean condicaoSatisfeita(Orcamento orcamento) {
		return orcamento.getValorTotal() < 500;
	}
	
	@Override
	double PrimeiraRegraImposto(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
	}
	
	@Override
	double SegundaRegraImposto(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.07;
	}
	
}
