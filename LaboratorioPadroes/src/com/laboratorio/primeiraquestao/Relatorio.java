package com.laboratorio.primeiraquestao;

public abstract class Relatorio {
	
	protected Banco banco;
		
	public Relatorio(Banco banco) {
		this.banco = banco;
	}
	
	
	public String geraRelatorio(Conta conta){
		return getCabecalho(conta) + " " + getCorpo(conta)+ " " + getRodape(conta);
	}
	
	
	public String getCabecalho(Conta conta){
		return null;
	}
	
	public String getCorpo(Conta conta){
		return null;
	}
	
	public String getRodape(Conta conta){
		return null;
	}
}
