package br.lelo.example.designpatters.observer;

import br.lelo.example.designpatters.commons.Preco;

public class Integracao implements ICalculoPublisher {

	public void calculate(Preco preco, int usuarioId) {
		System.out.println("Integração");
	}

}
