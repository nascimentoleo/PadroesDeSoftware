package com.template_method.questao01;

public class ImpostoMain {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		
		orcamento.addItem(new Item("Caderno",100));
		orcamento.addItem(new Item("Lápis",30));
		orcamento.addItem(new Item("Borracha",500));
		orcamento.addItem(new Item("Caneta",10));
		
		System.out.println(orcamento.getValorTotal());
		TemplateImposto imposto = new ImpostoICPP();
		System.out.println("Primeira regra de imposto:" + imposto.calculaImposto(orcamento));
		imposto = new ImpostoIKCV();
		System.out.println("Segunda regra de imposto:" + imposto.calculaImposto(orcamento));
		
		

	}

}
