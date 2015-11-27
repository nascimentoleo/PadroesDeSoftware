package com.laboratorio.segundaquestao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaPepperoniTest {

	private Pizza pizza;
	@Before
	public void setup() {
		pizza = new Pepperoni();
	}
	
	@Test
	public void valorPizzaPepperoni(){
		double valorEsperado = 14.9;
		assertEquals(valorEsperado, this.pizza.cost(),0.00001);
	}
	
	@Test
	public void valorPizzaComOreganoEBacon(){
		Pizza pizzaDecorated = new OreganoDecorator(new BaconDecorator(this.pizza));
		double valorEsperado = 16.2;
		assertEquals(valorEsperado, pizzaDecorated.cost(),0.00001);
	}

	@Test
	public void valorPizzaPepperoniComOreganoBaconTomate(){
		Pizza pizzaDecorated = new OreganoDecorator(new BaconDecorator(new TomateDecorator(this.pizza)));
		double valorEsperado = 16.3;
		assertEquals(valorEsperado, pizzaDecorated.cost(),0.00001);
	}

}
