package com.laboratorio.quartaquestao;

public class PropriedadesDoSistema implements RepositorioDeConfiguracoes {

	private RepositorioDeConfiguracoes proximo;
	
	@Override
	public String getConfiguracoes(String nome) {
		try {
			String valorConfiguracao = System.getProperty(nome);
			if(valorConfiguracao != null)
				return valorConfiguracao;
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.proximo.getConfiguracoes(nome);
		
	}

	@Override
	public void setProximo(RepositorioDeConfiguracoes repositorio) {
		this.proximo = repositorio;
	}

}
