package br.lelo.example.designpatters.observer;

import br.lelo.example.designpatters.commons.Preco;

public class PrecoSaveBusinessOld {

	public void salvarPreco(Preco preco, int usuarioId) {
		new DaoPreco().calculate(preco, usuarioId);

		new EnviaEmail().calculate(preco, usuarioId);
		new RecalcularVerbas().calculate(preco, usuarioId);
		new Integracao().calculate(preco, usuarioId);

		new GeradorCapa().calculate(preco, usuarioId);
	}
}
