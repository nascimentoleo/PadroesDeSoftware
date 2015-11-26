package com.laboratorio.segundaquestao;

public class OreganoDecorator extends CondimentDecorator {

	public OreganoDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public double cost() {
		return 0.5 + decoratedPizza.cost();
	}

}
