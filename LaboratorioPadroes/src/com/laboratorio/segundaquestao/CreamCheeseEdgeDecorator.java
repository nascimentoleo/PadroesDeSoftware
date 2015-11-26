package com.laboratorio.segundaquestao;

public class CreamCheeseEdgeDecorator extends CondimentDecorator {

	public CreamCheeseEdgeDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public double cost() {
		return 1.2 + decoratedPizza.cost();
	}

}
