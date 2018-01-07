package br.lelo.example.designpatters.commons;

import java.math.BigDecimal;

import org.junit.Assert;

public class MyAssert {

	public static void assertEquals(String valueA, BigDecimal valueB) {
		Assert.assertEquals(valueA, valueB.toString());
	}

	public static void assertEquals(double valueA, double valueB) {
		Assert.assertEquals(valueA, valueB, valueA);
	}

}
