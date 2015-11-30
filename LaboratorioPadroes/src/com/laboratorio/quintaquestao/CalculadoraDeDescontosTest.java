package com.laboratorio.quintaquestao;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeDescontosTest {

	private NotaFiscal nota;
	private CalculadoraDeDescontos calculadora;
	
	@Before
	public void setUp() throws Exception {
		this.calculadora = new CalculadoraDeDescontos();
		this.nota = new NotaFiscal();
		Produto produto1 = new Produto("Balde", 30, new BigDecimal("5"));
		Produto produto2 = new Produto("Caderno", 10, new BigDecimal("3"));
		Produto produto3 = new Produto("Borracha", 50, new BigDecimal("1.5"));
		this.nota.addItem(new Item(produto1, 21));
		this.nota.addItem(new Item(produto2, 5));
		this.nota.addItem(new Item(produto3, 3));
			
	}

	@Test
	public void DescontoParaClienteAntigo() {
		Cliente cliente = new Cliente(TipoCliente.ANTIGO, 5);
		BigDecimal valorEsperado = new BigDecimal("3.24");
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota));
	}
	
	@Test
	public void DescontoParaClienteAntigoMaisDeOitoAnos() {
		Cliente cliente = new Cliente(TipoCliente.ANTIGO, 9);
		BigDecimal valorEsperado = new BigDecimal("3.74");
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota));
	}
	
	@Test
	public void DescontoParaClienteAntigoEFrequenteMaisDeVinteProdutos() {
		this.nota.remove(2);
		this.nota.remove(1);
		Cliente cliente = new Cliente(TipoCliente.ANTIGO_E_FREQUENTE, 9);
		BigDecimal valorEsperado = new BigDecimal("3.15");
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota));
	}
	@Test
	public void DescontoParaClienteAntigoEFrequenteMaisDeCincoPorcento() {
		Cliente cliente = new Cliente(TipoCliente.ANTIGO_E_FREQUENTE, 9);
		BigDecimal valorEsperado = new BigDecimal("4.12");
		assertEquals(valorEsperado, calculadora.calcularDesconto(cliente, nota));
	}
	

}
