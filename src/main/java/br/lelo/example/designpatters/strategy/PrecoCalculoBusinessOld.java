package br.lelo.example.designpatters.strategy;

import java.math.BigDecimal;

import br.lelo.example.designpatters.commons.Preco;

public class PrecoCalculoBusinessOld {

	public BigDecimal calcularPreco(Preco preco, String baseCalculo) {

		if (baseCalculo.equals("PESO_LIQUIDO")) {
			return preco.getValor().add(preco.getVerba()).subtract(preco.getImposto()).subtract(preco.getTaxaAdm());
		}

		if (baseCalculo.equals("PESO_BRUTO")) {
			return preco.getValor().subtract(preco.getImposto()).add(preco.getVerba());
		}

		return null;
	}
}
