package com.template_method.questao01;

import java.util.HashSet;
import java.util.Set;

public class Orcamento {

	private Set<Item> items;
	
	public Orcamento() {
		this.items = new HashSet<>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public double getValorTotal() {
		double valor = 0;
		for(Item item : items)
			valor += item.getValor();
		return valor;
	}
	
	public boolean existeItemComValorMaiorQue(double valor){
		for(Item item : items)
			if(item.getValor() > valor)
				return true;
		return false;
	}

}
