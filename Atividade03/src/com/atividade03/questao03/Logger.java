package com.atividade03.questao03;

public class Logger {
	
	private boolean ativo = false;
	private static Logger logger;
	
	private Logger(){
		
	}
	
	public static Logger getInstance(){
		if(logger == null)
			logger = new Logger();
		return logger;
		
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void log(String s){
		if (ativo)
			System.out.println("LOG :: " + s);
	}

}
