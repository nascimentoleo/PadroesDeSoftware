package com.strategy.service;

import com.strategy.model.Imposto;
import com.strategy.model.Orcamento;

public class CalculadoraDeImposto {

	public double calcula(Orcamento orcamento, Imposto imposto) {
	    return imposto.calcula(orcamento);
	}

}
