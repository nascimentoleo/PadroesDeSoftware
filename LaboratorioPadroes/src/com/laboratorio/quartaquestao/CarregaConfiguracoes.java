package com.laboratorio.quartaquestao;

public class CarregaConfiguracoes {

	public String getConfiguracoes(String nomeConfiguracao){
		RepositorioDeConfiguracoes rep1 = new VariaveisDeAmbiente();
		RepositorioDeConfiguracoes rep2 = new PropriedadesDoSistema();
		RepositorioDeConfiguracoes rep3 = new Arquivo();
		RepositorioDeConfiguracoes rep4 = new ServidorWeb();
		rep1.setProximo(rep2);
		rep2.setProximo(rep3);
		rep3.setProximo(rep4);
		rep4.setProximo(new ConfiguracaoNaoEncontrada());
		
		return rep1.getConfiguracoes(nomeConfiguracao);
	}
}
