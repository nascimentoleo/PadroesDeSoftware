package com.template_method.questao01;

public abstract class TemplateImposto {
	
	public double calculaImposto(Orcamento orcamento){
		if(condicaoSatisfeita(orcamento))
			return PrimeiraRegraImposto(orcamento);
		return SegundaRegraImposto(orcamento);
	
	}

	double SegundaRegraImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	double PrimeiraRegraImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	boolean condicaoSatisfeita(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return false;
	}


}
