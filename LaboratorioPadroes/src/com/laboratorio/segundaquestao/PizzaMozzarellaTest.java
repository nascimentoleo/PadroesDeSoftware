package com.laboratorio.segundaquestao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaMozzarellaTest extends Pizza {

	private Pizza pizza;
	
	@Before
	public void setup() {
		this.pizza = new Mozzarella();
	}
	
	@Test
	public void valorPizzaMuzzarella(){
		double valorEsperado = 11.9;
		assertEquals(valorEsperado, this.pizza.cost(),0.00001);
	}
	
	@Test
	public void valorPizzaMuzzarellaComTomate(){
		Pizza pizzaDecorated = new TomateDecorator(this.pizza);
		double valorEsperado = 12.0;
		assertEquals(valorEsperado, pizzaDecorated.cost(),0.00001);
	}

	@Test
	public void valorPizzaMuzzarellaComTomateECreamCheeseEdge(){
		Pizza pizzaDecorated = new TomateDecorator(new CreamCheeseEdgeDecorator(this.pizza));
		double valorEsperado = 13.2;
		assertEquals(valorEsperado, pizzaDecorated.cost(),0.00001);
	}
}
