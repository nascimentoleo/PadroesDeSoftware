package com.laboratorio.quartaquestao;

public class ConfiguracaoNaoEncontrada implements RepositorioDeConfiguracoes {

	@Override
	public String getConfiguracoes(String nome) {
		return "Configuração Padrão";
	}

	@Override
	public void setProximo(RepositorioDeConfiguracoes repositorio) {
	}

}
