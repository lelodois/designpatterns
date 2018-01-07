package br.lelo.example.designpatters.observer;

import br.lelo.example.designpatters.commons.Preco;

public interface ICalculoPublisher {
	public void calculate(Preco preco, int usuarioId);

}
