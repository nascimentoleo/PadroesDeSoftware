package com.laboratorio.primeiraquestao;

public class Conta {

	private double saldo;
	private String titular;

	
	public Conta(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

}
