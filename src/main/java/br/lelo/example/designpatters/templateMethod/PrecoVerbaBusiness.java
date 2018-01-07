package br.lelo.example.designpatters.templateMethod;

import java.math.BigDecimal;

import br.lelo.example.designpatters.commons.Precificacao;
import br.lelo.example.designpatters.commons.Preco;

public class PrecoVerbaBusiness {

	public BigDecimal calcularVerba(Precificacao item, String mercado) {
		Preco produtoAltoGiroVendaDepreciado = null;

		if (item.getPrecoAtual().getValor().doubleValue() > item.getPrecoNovo().getValor().doubleValue()) {
			if (item.isProdutoAlgoGiro()) {
				produtoAltoGiroVendaDepreciado = item.getPrecoNovo();
			}
		}

		if (produtoAltoGiroVendaDepreciado != null && mercado.equals("ATACADO")) {
			BigDecimal verba = produtoAltoGiroVendaDepreciado.getVerba();
			return verba.add(verba.multiply(new BigDecimal("0.20")));
		}

		if (produtoAltoGiroVendaDepreciado != null && mercado.equals("VAREJO")) {
			BigDecimal verba = produtoAltoGiroVendaDepreciado.getVerba();
			return verba.add(verba.multiply(new BigDecimal("0.10")));
		}

		return item.getPrecoNovo().getVerba();
	}
}
