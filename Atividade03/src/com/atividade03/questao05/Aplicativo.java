package com.atividade03.questao05;

public class Aplicativo {

	public static void main(String[] args) {
	
		MediadorNegociacao mediador = new MediadorNegociacao();
		mediador.registrarVendedor(new VendedorEUA());
				
		Comprador comprador1 = new CompradorBrasil();
		Comprador comprador2 = new CompradorFranca();
		
		boolean aceitou = false;
		double valorOfertado = 12;
		
		while (!aceitou){
			comprador1.proporValor(mediador,valorOfertado);
			valorOfertado += 3;   
		}
		System.out.println("Vendedor aceitou proposta do brasileiro  com o valor de " + valorOfertado);
		
		valorOfertado = 3;
		while (!aceitou){
			comprador2.proporValor(mediador,valorOfertado);
			valorOfertado += 1.5;   
		}
		System.out.println("Vendedor aceitou proposta do francês com o valor de " + valorOfertado);
		
		
		
	}

}
