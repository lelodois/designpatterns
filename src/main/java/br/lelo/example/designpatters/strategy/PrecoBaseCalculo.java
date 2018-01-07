package br.lelo.example.designpatters.strategy;

import java.math.BigDecimal;

import br.lelo.example.designpatters.commons.Preco;

public enum PrecoBaseCalculo {

	PRECO_LIQUIDO {
		@Override
		public BigDecimal subtract(Preco preco) {
			return preco.getValor().add(preco.getVerba()).subtract(preco.getImposto()).subtract(preco.getTaxaAdm());
		}

	},
	PRECO_BRUTO {
		@Override
		public BigDecimal subtract(Preco preco) {
			return preco.getValor().subtract(preco.getImposto()).add(preco.getVerba());
		}

	};

	public abstract BigDecimal subtract(Preco preco);

}
