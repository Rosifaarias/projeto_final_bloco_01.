package LojaRepository;

import Loja.model.Produto;

import java.util.List;

public interface LojaRepository {
	void cadastrar(Produto produto);

	void atualizar(Produto produto);

	void deletar(String nome);

	Produto procurarPorNome(String nome);

	List<Produto> listarTodosProdutos();
}