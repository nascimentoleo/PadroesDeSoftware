package com.laboratorio.quartaquestao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Arquivo implements RepositorioDeConfiguracoes {

	private RepositorioDeConfiguracoes proximo;
	
	@Override
	public String getConfiguracoes(String nome) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("prop.properties"));
			return prop.getProperty(nome);
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
