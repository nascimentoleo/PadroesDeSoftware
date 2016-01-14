package com.decorator.questao01;

public abstract class ImpostoDecorator extends TemplateImposto {

	private Imposto impostoDecorado;
	
	public ImpostoDecorator() {
		// TODO Auto-generated constructor stub
	}
	
	public ImpostoDecorator(Imposto impostoDecorado) {
		super();
		this.impostoDecorado = impostoDecorado;
	}

	private double calculaImpostoDecorado(Orcamento orcamento){
		if(this.impostoDecorado != null)
			return this.impostoDecorado.calculaImposto(orcamento);
		return 0;
	}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return super.calculaImposto(orcamento) + calculaImpostoDecorado(orcamento);
	}

}
