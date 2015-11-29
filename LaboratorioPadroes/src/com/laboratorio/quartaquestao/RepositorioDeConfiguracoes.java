package com.laboratorio.quartaquestao;

public interface RepositorioDeConfiguracoes {

	public String getConfiguracoes(String nome);
	void setProximo(RepositorioDeConfiguracoes repositorio);
}
