package ProjetoBase.controller;

import ProjetoBase.model.Produto;

public interface IProdutoController {
    void cadastrarProduto(int id, String nome, int quantidade);
    void listarProdutos();
    void atualizarProduto(int id, String novoNome, int novaQuantidade);
    void removerProduto(int id);
    Produto buscarProdutoPorId(int id);
}
