package com.laboratorio.quartaquestao;

public class VariaveisDeAmbiente implements RepositorioDeConfiguracoes {

	private RepositorioDeConfiguracoes proximo;
	@Override
	public String getConfiguracoes(String nome) {
		String valorConfiguracao = System.getenv(nome);
		if(valorConfiguracao != null)
			return valorConfiguracao;
		return this.proximo.getConfiguracoes(nome);
	}

	@Override
	public void setProximo(RepositorioDeConfiguracoes repositorio) {
		this.proximo = repositorio;
	}

}
