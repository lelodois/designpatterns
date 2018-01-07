package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoBusinessOld {

	public double calcularDesconto(BigDecimal valorVenda) {

		double desconto = 0.00;

		if (valorVenda.doubleValue() >= 15 && valorVenda.doubleValue() < 25) {
			desconto = valorVenda.doubleValue() * 0.08;
		}

		if (valorVenda.doubleValue() >= 25 && valorVenda.doubleValue() < 50) {
			desconto = valorVenda.doubleValue() * 0.10;
		}

		if (valorVenda.doubleValue() >= 50) {
			desconto = valorVenda.doubleValue() * 0.12;
		}

		return desconto;
	}
}
