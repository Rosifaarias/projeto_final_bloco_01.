package Loja.model;

public abstract class Produto {

	private String cor; 
	private double preco;
	private String tamanho;

	public Produto(String cor, double preco, String tamanho) {
		this.cor = cor;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void exibirdetalhes() {
		System.out.println("Cor: " + cor);
		System.out.println("Preço: " + preco);
		System.out.println("Tamanho: " + tamanho);
	}
}