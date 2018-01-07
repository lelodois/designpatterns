package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoTres implements PrecoDescontoChainOfResp {

    public double calcularDesconto(BigDecimal valorVenda) {
        if (valorVenda.doubleValue() >= 50) {
            return valorVenda.doubleValue() * 0.12;
        }
        return next().calcularDesconto(valorVenda);
    }

    public PrecoDescontoChainOfResp next() {
        return new PrecoDescontoZero();
    }
}
