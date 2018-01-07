package br.lelo.example.designpatters.memento;

import br.lelo.example.designpatters.commons.Preco;

public class PrecoFlowBusiness {

    public void aprovar(Preco preco) {

        PrecoFlowMemento precoFlowMemento = new PrecoFlowMemento();

        precoFlowMemento.addStatus(preco.getStatus());

        if (preco.getValor().doubleValue() > 0.0) {
            precoFlowMemento.addStatus(preco.avancar());
        }

        if (preco.getProdutoFilial() > 0) {
            precoFlowMemento.addStatus(preco.avancar());
        }

        System.out.println("inicio: " + precoFlowMemento.getStatus(0));
        System.out.println("fim: " + precoFlowMemento.getStatus(2));
    }
}
