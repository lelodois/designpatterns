package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoPrimeiro implements PrecoDescontoChainOfResp {

    public double calcularDesconto(BigDecimal valorVenda) {
        if (valorVenda.doubleValue() >= 15 && valorVenda.doubleValue() < 25) {
            return valorVenda.doubleValue() * 0.08;
        }
        return next().calcularDesconto(valorVenda);
    }

    public PrecoDescontoChainOfResp next() {
        return new PrecoDescontoDois();
    }
}
