package br.lelo.example.designpatters.commons;

public class Precificacao {

	private Preco precoNovo;
	private Preco precoAtual;
	private boolean produtoAlgoGiro;

	public Precificacao(Preco precoNovo, Preco precoAtual, boolean produtoAlgoGiro) {
		super();
		this.precoNovo = precoNovo;
		this.precoAtual = precoAtual;
		this.produtoAlgoGiro = produtoAlgoGiro;
	}

	public Preco getPrecoAtual() {
		return precoAtual;
	}

	public Preco getPrecoNovo() {
		return precoNovo;
	}

	public boolean isProdutoAlgoGiro() {
		return produtoAlgoGiro;
	}

}