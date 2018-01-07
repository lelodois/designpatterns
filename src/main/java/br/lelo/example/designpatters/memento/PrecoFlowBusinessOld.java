package br.lelo.example.designpatters.memento;

import br.lelo.example.designpatters.commons.Preco;
import br.lelo.example.designpatters.commons.Status.StatusEnum;

public class PrecoFlowBusinessOld {

    public void aprovar(Preco preco) {

        StatusEnum oldStatus = preco.getStatus();

        if (preco.getValor().doubleValue() > 0.0)
            preco.avancar();

        if (preco.getProdutoFilial() > 0)
            preco.avancar();

        System.out.println("inicio: " + oldStatus);
        System.out.println("fim: " + preco.getStatus());
    }
}
