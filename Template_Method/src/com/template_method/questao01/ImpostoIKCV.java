package com.template_method.questao01;



public class ImpostoIKCV extends TemplateImposto {
	
	@Override
	boolean condicaoSatisfeita(Orcamento orcamento) {
		return orcamento.getValorTotal() > 500 && orcamento.existeItemComValorMaiorQue(100);
	}
	
	@Override
	double PrimeiraRegraImposto(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.1;
	}
	
	@Override
	double SegundaRegraImposto(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

}
