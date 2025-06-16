package ProjetoBase.controller;

import ProdutoBase.model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    public void cadastrarProduto(ArrayList<Produto> produtos, Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("--------------------------");
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println("ID: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("-------------------------");
            }
        }
    }

    public void atualizarProduto(ArrayList<Produto> produtos, int id, String novoNome, int novaQuantidade) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado para atualizar.");
            return;
        }

        Produto produto = buscarProdutoPorId(produtos, id);

        if (produto != null) {
            produto.setNome(novoNome);
            produto.setQuantidade(novaQuantidade);
            System.out.println("Produto atualizado com sucesso.");
            return;
        } else {
            System.out.println("Produto não encontrado.");
            return;
        }

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(novoNome);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(ArrayList<Produto> produtos, int id) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado para remover.");
            return;
        }

        Produto produto = buscarProdutoPorId(produtos, id);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public Produto buscarProdutoPorId(ArrayList<Produto> produtos, int id) {
        if (produtos.isEmpty()) {
            return null;
        }

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        
        return null;
    }
}