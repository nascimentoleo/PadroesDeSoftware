package com.laboratorio.quintaquestao;

public class ClienteAntigoEFrequente implements DescontoStrategy {

	private RegraDeTaxaParaDesconto regra;
	
	public ClienteAntigoEFrequente() {
		regra = new ProdutoAcimaDeVinte();
		regra.setProximo(new ProdutoAcimaDoEstoque());
	}
	
	
	@Override
	public double desconto(Cliente cliente, NotaFiscal nota) {
		double totalDesconto = 0;
		for(Item item : nota.getItems()){
			totalDesconto += item.getValor() * regra.getTaxa(item);
		}
		return totalDesconto;
	}
	

}
