package br.lelo.example.designpatters.strategy;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import br.lelo.example.designpatters.commons.MyAssert;
import br.lelo.example.designpatters.commons.Preco;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class PrecoCalculoTest {

    private PrecoCalculoBusinessOld business = new PrecoCalculoBusinessOld();

    @Test
    public void equalsPrecoLiquido() {
        Preco preco = getPrecoMock();
        MyAssert.assertEquals("8.90", business.calcularPreco(preco, "PRECO_LIQUIDO"));
    }

    @Test
    public void equalsPrecoBruto() {
        Preco preco = getPrecoMock();
        MyAssert.assertEquals("9.90", business.calcularPreco(preco, "PRECO_BRUTO"));
    }

    private Preco getPrecoMock() {
        return new Preco(6810001, new BigDecimal("0.50"), new BigDecimal("1.00"), new BigDecimal("10.25"), new BigDecimal("0.15"));
    }
}
