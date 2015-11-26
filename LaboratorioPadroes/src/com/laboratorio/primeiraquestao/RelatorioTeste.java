package com.laboratorio.primeiraquestao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RelatorioTeste {

	private Banco banco;
	private List<Conta> contas;
	
	@Before
	public void setup() {
		this.banco = new Banco("Banco do Brasil","99999999","Centro","bb@bb.com");
		this.contas = new ArrayList<>();
		this.contas.add(new Conta(20.9, "Joana"));
		this.contas.add(new Conta(19, "Mateus"));
		this.contas.add(new Conta(5, "Pedro"));
	}

	
	@Test
	public void deveGerarRelatorioSimples(){
		Relatorio relatorio = new RelatorioSimples(this.banco);
		String valorEsperado = "Banco do Brasil 99999999 Joana 20.9 Banco do Brasil 99999999";
		assertEquals(valorEsperado, relatorio.geraRelatorio(contas.get(0)));
	}
	
	@Test
	public void deveGerarRelatorioComplexo(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Relatorio relatorio = new RelatorioComplexo(this.banco);
		String valorEsperado = "Banco do Brasil Centro 99999999 null bb@bb.com " + sdf.format(new Date());
		assertEquals(valorEsperado, relatorio.geraRelatorio(contas.get(0)));
	}
	
}
