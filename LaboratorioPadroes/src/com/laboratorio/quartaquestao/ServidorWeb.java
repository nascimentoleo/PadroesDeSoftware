package com.laboratorio.quartaquestao;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ServidorWeb implements RepositorioDeConfiguracoes {

	private RepositorioDeConfiguracoes proximo;
	@Override
	public String getConfiguracoes(String nome) {
		try {
			URL url = new URL("192.168.0.1");
			InputStream is = url.openStream();
			String valorConfiguracao = is.toString();
			if(valorConfiguracao != null)
				return valorConfiguracao;
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return this.proximo.getConfiguracoes(nome);
	}

	@Override
	public void setProximo(RepositorioDeConfiguracoes repositorio) {
		this.proximo = repositorio;
	}

}
