package com.laboratorio.quintaquestao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotaFiscal {

	private List<Item> listaDeItems;
	
	public NotaFiscal() {
		this.listaDeItems = new ArrayList<>();
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(this.listaDeItems);
	}
	
	public void addItem(Item item){
		this.listaDeItems.add(item);
	}
	public void remove(int index){
		this.listaDeItems.remove(index);
	}
	
	
}
