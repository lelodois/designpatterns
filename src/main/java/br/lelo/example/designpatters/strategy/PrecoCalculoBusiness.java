package br.lelo.example.designpatters.strategy;

import java.math.BigDecimal;

import br.lelo.example.designpatters.commons.Preco;

public class PrecoCalculoBusiness {

	public BigDecimal calcularPreco(Preco preco, String baseCalculo) {
		return PrecoBaseCalculo.valueOf(baseCalculo).subtract(preco);
	}
}
