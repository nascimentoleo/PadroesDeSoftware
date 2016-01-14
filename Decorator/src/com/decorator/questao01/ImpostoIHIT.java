package com.decorator.questao01;

public class ImpostoIHIT extends ImpostoDecorator  {
	
	
	public ImpostoIHIT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImpostoIHIT(Imposto impostoDecorado) {
		super(impostoDecorado);
		// TODO Auto-generated constructor stub
	}

	@Override
	double PrimeiraRegraImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return super.PrimeiraRegraImposto(orcamento);
	}
	
	@Override
	double SegundaRegraImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return super.SegundaRegraImposto(orcamento);
	}

}
