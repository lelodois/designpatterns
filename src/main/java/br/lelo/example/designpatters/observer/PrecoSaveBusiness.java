package br.lelo.example.designpatters.observer;

import java.util.ArrayList;
import java.util.List;

import br.lelo.example.designpatters.commons.Preco;

public class PrecoSaveBusiness {

	public void salvarPreco(Preco preco, int usuarioId) {
		for (ICalculoPublisher listener : getListeners()) {
			listener.calculate(preco, usuarioId);
		}
	}

	private List<ICalculoPublisher> getListeners() {
		List<ICalculoPublisher> listeners = new ArrayList<ICalculoPublisher>();
		listeners.add(new DaoPreco());
		listeners.add(new EnviaEmail());
		listeners.add(new GeradorCapa());
		listeners.add(new Integracao());
		listeners.add(new RecalcularVerbas());
		return listeners;
	}
}
