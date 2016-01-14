package com.decorator.questao01;

public class DecoratorTeste {

	public static void main(String[] args) {
	
		Orcamento orcamento = new Orcamento();
		
		orcamento.addItem(new Item("Caderno",100));
		orcamento.addItem(new Item("Lápis",30));
		orcamento.addItem(new Item("Borracha",500));
		orcamento.addItem(new Item("Caneta",10));
		
		Imposto imposto = new ImpostoICPP(new ImpostoIKCV());
		Imposto impostoSoICPP = new ImpostoICPP();
		Imposto impostoSoIKCV = new ImpostoIKCV();
		
		System.out.println("Orcamento total: " + orcamento.getValorTotal());
		System.out.println("Imposto decorado: " + imposto.calculaImposto(orcamento));
		System.out.println("ICPP: " + impostoSoICPP.calculaImposto(orcamento));
		System.out.println("IKCV: " + impostoSoIKCV.calculaImposto(orcamento));
	}
	

}

