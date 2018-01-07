package br.lelo.example.designpatters.observer;

import br.lelo.example.designpatters.commons.Preco;

public class DaoPreco implements ICalculoPublisher {

	public void calculate(Preco preco, int usuarioId) {
		System.out.println("Preco salvo");
	}

}
