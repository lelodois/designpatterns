package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public interface PrecoDescontoChainOfResp {

	public double calcularDesconto(BigDecimal valorVenda);
	public PrecoDescontoChainOfResp next();
}
