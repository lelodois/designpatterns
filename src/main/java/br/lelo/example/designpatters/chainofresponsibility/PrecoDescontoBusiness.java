package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

public class PrecoDescontoBusiness {

    public double calcularDesconto(BigDecimal valorVenda) {
        return new PrecoDescontoPrimeiro().calcularDesconto(valorVenda);
    }
}
