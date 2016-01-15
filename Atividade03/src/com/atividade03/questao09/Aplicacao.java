package com.atividade03.questao09;

public class Aplicacao {
	
	public static  void main(String[] args) {

		DiretorioComposto raiz = new Pasta("Diretorio Raiz");
		DiretorioComposto sub1 = new Pasta("SubDiretorio1");
		DiretorioComposto sub2 = new Pasta("SubDiretorio2");
		raiz.addDiretorio(sub1);
		raiz.addDiretorio(sub2);
		sub1.addDiretorio(new Arquivo("Arquivo1", 200));
		sub1.addDiretorio(new Arquivo("Arquivo2", 100));
		
		raiz.imprime();
		
		
	}

}
