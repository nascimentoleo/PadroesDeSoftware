package com.laboratorio.quintaquestao;

public class ClienteAntigo implements DescontoStrategy {

	@Override
	public double desconto(Cliente cliente, NotaFiscal nota) {
		double totalDesconto = 0;
		double descontoPorAnos = this.getDescontoPorAnos(cliente.getAnos());
		
		for(Item item : nota.getItems())
			totalDesconto += item.calculaDesconto(0.02) + item.calculaDesconto(descontoPorAnos);
		
		return totalDesconto;
	}
		
	private double getDescontoPorAnos(int anos){
		if(anos < 8)
			return anos * 0.0012;
		return 0.01;
	}

}
