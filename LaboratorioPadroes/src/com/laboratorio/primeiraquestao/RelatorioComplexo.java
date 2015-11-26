package com.laboratorio.primeiraquestao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioComplexo extends Relatorio {

	public RelatorioComplexo(Banco banco) {
		super(banco);
	}
	
	@Override
	public String getCabecalho(Conta conta) {
		return banco.getNome() + " " + banco.getEndereco() + " " + banco.getTelefone();
	}
	
	@Override
	public String getRodape(Conta conta) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return banco.getEmail() + " " + sdf.format(new Date());
	}
	
	@Override
	public String getCorpo(Conta conta) {
		// TODO Auto-generated method stub
		return super.getCorpo(conta);
	}

}
