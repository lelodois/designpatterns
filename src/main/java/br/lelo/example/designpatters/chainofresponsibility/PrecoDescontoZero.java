package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoZero implements PrecoDescontoChainOfResp {

    public double calcularDesconto(BigDecimal valorVenda) {
        return 0.0;
    }

    public PrecoDescontoChainOfResp next() {
        return null;
    }
}
