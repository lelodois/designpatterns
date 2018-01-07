package br.lelo.example.designpatters.commons;

import java.math.BigDecimal;

import br.lelo.example.designpatters.commons.Status.StatusEnum;

public class Preco {

	private int produtofilial;
	private BigDecimal imposto;
	private BigDecimal taxaAdm;
	private BigDecimal valor;
	private BigDecimal verba;
	private Status status;

	public Preco(int produtofilial, BigDecimal imposto, BigDecimal taxaAdm, BigDecimal valor, BigDecimal verba) {
		super();
		this.produtofilial = produtofilial;
		this.imposto = imposto;
		this.taxaAdm = taxaAdm;
		this.valor = valor;
		this.verba = verba;
		this.status = new Status(null);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getProdutoFilial() {
		return produtofilial;
	}

	public BigDecimal getTaxaAdm() {
		return taxaAdm;
	}

	public BigDecimal getVerba() {
		return verba;
	}

	public BigDecimal getImposto() {
		return imposto;
	}

	public StatusEnum getStatus() {
		return status.getStatus();
	}

	public StatusEnum avancar() {
		this.status = new Status(status.nextStatus());
		return this.getStatus();
	}

}
