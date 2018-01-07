package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoDois implements PrecoDescontoChainOfResp {

    public double calcularDesconto(BigDecimal valorVenda) {
        if (valorVenda.doubleValue() >= 25 && valorVenda.doubleValue() < 50) {
            return  valorVenda.doubleValue() * 0.10;
        }
        return this.next().calcularDesconto(valorVenda);
    }

    public PrecoDescontoChainOfResp next() {
        return new PrecoDescontoTres();
    }
}
