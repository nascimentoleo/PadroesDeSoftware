package com.laboratorio.segundaquestao;

public abstract class CondimentDecorator extends Pizza {
	
	protected Pizza decoratedPizza;

	public CondimentDecorator(Pizza decoratedPizza) {
		this.decoratedPizza = decoratedPizza;
	}
	
		

}
