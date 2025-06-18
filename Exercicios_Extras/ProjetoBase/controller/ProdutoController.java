package ProjetoBase.controller;

import ProjetoBase.model.Produto;
import java.util.ArrayList;

public class ProdutoController implements IProdutoController {
    ArrayList<Produto> produtosList;

    public ProdutoController() {
        this.produtosList = new ArrayList<>();
    }

    @Override
    public void cadastrarProduto(int id, String nome, int quantidade) {
        Produto produto = new Produto(id, nome, quantidade);
        produtosList.add(produto);
    }

    @Override
    public void listarProdutos() {
        if (produtosList.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtosList) {
                System.out.println("-".repeat(10));
                System.out.println("ID: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("-".repeat(10));
            }
        }
    }

    @Override
    public void atualizarProduto(int id, String novoNome, int novaQuantidade) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setQuantidade(novaQuantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    @Override
    public void removerProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtosList.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtosList) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}