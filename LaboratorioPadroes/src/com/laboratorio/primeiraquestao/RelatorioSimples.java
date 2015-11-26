package com.laboratorio.primeiraquestao;

public class RelatorioSimples extends Relatorio {


	public RelatorioSimples(Banco banco) {
		super(banco);
	}

	@Override
	public String getCabecalho(Conta conta) {
		 return banco.getNome() + " " + banco.getTelefone();
	}
	
	@Override
	public String getRodape(Conta conta) {
		 return banco.getNome() + " " + banco.getTelefone();
	}
	
	@Override
	public String getCorpo(Conta conta) {
		return conta.getTitular() + " " + conta.getSaldo(); 
	}
}
