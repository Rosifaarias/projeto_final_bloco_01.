package Loja.model;

public class Vestido extends Produto {

	private String modelo;

	public Vestido(String cor, double preco, String tamanho, String modelo) {
		super(cor, preco, tamanho);

		this.modelo = modelo;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}