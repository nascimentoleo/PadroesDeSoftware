package com.strategy.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.strategy.model.ICCC;
import com.strategy.model.ICMS;
import com.strategy.model.ISS;
import com.strategy.model.Imposto;
import com.strategy.model.Orcamento;
import com.strategy.service.CalculadoraDeImposto;

public class TesteEstrategias {

	private Orcamento orcamento;
	private CalculadoraDeImposto calculadoraDeImposto;
	private Imposto iccc;
	private Imposto iss;
	private Imposto icms;

	@Before
	public void setup() {
		this.orcamento = new Orcamento(100);
		this.calculadoraDeImposto = new CalculadoraDeImposto();
		this.iccc = new ICCC();
		this.iss = new ISS();
		this.icms = new ICMS();
	}

	@Test
	public void calcularImpostoISS() {
		assertEquals(6, calculadoraDeImposto.calcula(this.orcamento, iss), 0000.1);
	}

	@Test
	public void calcularImpostoICMS() {
		assertEquals(55, calculadoraDeImposto.calcula(this.orcamento, icms), 0000.1);
	}

	@Test
	public void calcularICCCParaSaldo100() {
		assertEquals(5, calculadoraDeImposto.calcula(this.orcamento, iccc), 0000.1);
	}

	@Test
	public void calcularICCCParaSaldo2000() {
		this.orcamento = new Orcamento(2000);
		assertEquals(140, calculadoraDeImposto.calcula(this.orcamento, iccc), 0000.1);
	}
	
	@Test
	public void calcularICCCParaSaldo4000() {
		this.orcamento = new Orcamento(4000);
		assertEquals(350, calculadoraDeImposto.calcula(this.orcamento, iccc), 0000.1);
	}

}
