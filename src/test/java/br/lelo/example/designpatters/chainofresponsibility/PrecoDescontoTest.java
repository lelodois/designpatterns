package br.lelo.example.designpatters.chainofresponsibility;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import br.lelo.example.designpatters.chainofresponsibility.PrecoDescontoBusiness;
import br.lelo.example.designpatters.commons.MyAssert;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class PrecoDescontoTest {

	private PrecoDescontoBusiness business = new PrecoDescontoBusiness();

	@Test
	public void semDescontoTest() {
		MyAssert.assertEquals(0.00, business.calcularDesconto(new BigDecimal("10.50")));
	}

	@Test
	public void descontoOitoPontosPercentuaisTest() {
		MyAssert.assertEquals(1.96, business.calcularDesconto(new BigDecimal("24.50")));
	}

	@Test
	public void descontoDezPontosPercentuaisTest() {
		MyAssert.assertEquals(4.00, business.calcularDesconto(new BigDecimal("40.00")));
	}

	@Test
	public void descontoDozePontosPercentuaisTest() {
		MyAssert.assertEquals(6.24, business.calcularDesconto(new BigDecimal("52.00")));
	}

}
