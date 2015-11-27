package com.laboratorio.terceiraquestao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProcessoTest {

	private Processo processo;
	
	@Before
	public void setup() {
		processo = new Processo();
	}
	
	@Test
	public void criarProcesso(){
		this.processo.criar();
		String valorEsperado = "Processo Criado!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	
	@Test
	public void designarProcesso(){
		this.processo.criar();
		this.processo.designar();
		String valorEsperado = "Processo Em Avaliacao!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	
	@Test
	public void deferirProcesso(){
		this.processo.criar();
		this.processo.designar();
		this.processo.deferir();
		String valorEsperado = "Processo Deferido!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	
	@Test
	public void indeferirProcesso(){
		this.processo.criar();
		this.processo.designar();
		this.processo.indeferir();
		String valorEsperado = "Processo indeferido!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	
	@Test
	public void cancelarProcesso(){
		this.processo.criar();
		this.processo.cancelar();
		String valorEsperado = "Processo Fechado!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	
	@Test
	public void prazoLegalProcesso(){
		this.processo.criar();
		this.processo.designar();
		this.processo.deferir();
		this.processo.finalizar();
		String valorEsperado = "Processo Fechado!";
		assertEquals(valorEsperado, this.processo.getEstadoAtual());
	}
	


}
