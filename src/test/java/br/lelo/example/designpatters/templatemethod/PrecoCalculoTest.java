package br.lelo.example.designpatters.templatemethod;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import br.lelo.example.designpatters.commons.MyAssert;
import br.lelo.example.designpatters.commons.Precificacao;
import br.lelo.example.designpatters.commons.Preco;
import br.lelo.example.designpatters.templateMethod.PrecoVerbaBusiness;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class PrecoCalculoTest {

	private PrecoVerbaBusiness business = new PrecoVerbaBusiness();

	@Test
	public void equalsVerbaAtacadoDepreciadoComAltoGiro() {
		Preco precoAtual = getPrecoAtualMock("10.00");
		Preco precoNovo = getPrecoAtualMock("9.00");
		Precificacao item = new Precificacao(precoNovo, precoAtual, true);

		MyAssert.assertEquals("0.6000", business.calcularVerba(item, "ATACADO"));
	}

	@Test
	public void equalsVerbaVarejoDepreciadoComAltoGiro() {
		Preco precoAtual = getPrecoAtualMock("10.00");
		Preco precoNovo = getPrecoAtualMock("9.00");
		Precificacao item = new Precificacao(precoNovo, precoAtual, true);

		MyAssert.assertEquals("0.5500", business.calcularVerba(item, "VAREJO"));
	}

	@Test
	public void equalsVerbaVarejoNaoDepreciado() {
		Preco precoAtual = getPrecoAtualMock("10.00");
		Preco precoNovo = getPrecoAtualMock("10.50");
		Precificacao item = new Precificacao(precoNovo, precoAtual, true);

		MyAssert.assertEquals("0.50", business.calcularVerba(item, "ATACADO"));
	}

	@Test
	public void equalsVerbaAtacadoNaoDepreciado() {
		Preco precoAtual = getPrecoAtualMock("10.00");
		Preco precoNovo = getPrecoAtualMock("10.50");
		Precificacao item = new Precificacao(precoNovo, precoAtual, true);

		MyAssert.assertEquals("0.50", business.calcularVerba(item, "VAREJO"));
	}

	private Preco getPrecoAtualMock(String preco) {
		return new Preco(6810001, new BigDecimal("0.00"), new BigDecimal("1.00"), new BigDecimal(preco), new BigDecimal("0.50"));
	}
}
