package com.laboratorio.quintaquestao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeDescontosTest {

	private NotaFiscal nota;
	private CalculadoraDeDescontos calculadora;
	
	@Before
	public void setUp() throws Exception {
		this.calculadora = new CalculadoraDeDescontos();
		this.nota = new NotaFiscal();
		Produto produto1 = new Produto("Balde", 30);
		Produto produto2 = new Produto("Caderno", 10);
		Produto produto3 = new Produto("Borracha", 50);
		this.nota.addItem(new Item(produto1, 40, 4));
		this.nota.addItem(new Item(produto2, 10, 5));
		this.nota.addItem(new Item(produto3, 1.5, 3));
			
	}

	@Test
	public void DescontoParaClienteAntigo() {
		Cliente cliente = new Cliente(TipoCliente.ANTIGO, 5);
		double valorEsperado = 1.06;
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota),0000.1);
	}
	
	@Test
	public void DescontoParaClienteAntigoMaisDeOitoAnos() {
		Cliente cliente = new Cliente(TipoCliente.ANTIGO, 9);
		double valorEsperado = 1.06;
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota),0000.1);
	}
	
	

}
