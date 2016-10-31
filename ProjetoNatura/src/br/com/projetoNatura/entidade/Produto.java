package br.com.projetoNatura.entidade;

public class Produto {

	private String nome;
	private int codigoProduto;
	private String descricao;
	private double preco;
	

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Nome Produto = " + this.nome + "/nCodigo produto = "
				+ this.codigoProduto + "/nDescricao produto " + this.descricao;
	}
}
