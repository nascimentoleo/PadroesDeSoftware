package com.template_method.questao01;

public class ImpostoICPP extends TemplateImposto {

	
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
