package com.atividade03.questao03;

public class Aplicacao {

	public static void main(String[] args) {
		Logger log = Logger.getInstance();
		
		log.setAtivo(true);
		log.log("PRIMEIRA MENSAGEM DE LOG");
		log.log("SEGUNDA MENSAGEM DE LOG");

	}

}
