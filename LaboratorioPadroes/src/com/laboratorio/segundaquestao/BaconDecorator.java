package com.laboratorio.segundaquestao;

public class BaconDecorator extends CondimentDecorator {

	public BaconDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public double cost() {
		return 0.80 + decoratedPizza.cost();
	}

	
}
