package com.laboratorio.quartaquestao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarregaConfiguracoesTest {

	private CarregaConfiguracoes carregaConf;
	
	@Before
	public void setUp() throws Exception {
		carregaConf = new CarregaConfiguracoes();
	}

	@Test
	public void carregarConfiguracaoPadrao() {
		String valorEsperado = "Configuração Padrão";
		assertEquals(valorEsperado, carregaConf.getConfiguracoes("Configuração Qualquer"));
		
	}

}
