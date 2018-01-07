package br.lelo.example.designpatters.observer;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import br.lelo.example.designpatters.commons.Preco;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class PrecoSaveTest {

	private PrecoSaveBusinessOld business = new PrecoSaveBusinessOld();

	@Test
	public void saveTest() {
		Preco preco = new Preco(6810001, new BigDecimal("0.00"), new BigDecimal("1.00"), new BigDecimal("20.00"), new BigDecimal("0.50"));
		business.salvarPreco(preco, 517);
	}

}
