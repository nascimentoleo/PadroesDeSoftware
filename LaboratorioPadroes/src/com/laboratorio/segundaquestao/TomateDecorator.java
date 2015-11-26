package com.laboratorio.segundaquestao;

public class TomateDecorator extends CondimentDecorator {

	public TomateDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public double cost() {
		return 0.10 + decoratedPizza.cost();
	}

}
