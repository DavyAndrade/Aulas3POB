package ProjetoBase.view;

import java.util.Scanner;
import ProjetoBase.controller.ProdutoController;

public class ProdutoView {
    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();
        int opcao;

        do {
            System.out.println("-".repeat(20));
            System.out.println("Menu de Produtos:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Remover Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Cadastro de Produto:");

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    produtoController.cadastrarProduto(id, nome, quantidade);
                    System.out.println("Produto cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Listando Produtos:");
                    produtoController.listarProdutos();
                }
                case 3 -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Atualizar Produto:");

                    System.out.print("ID do Produto a ser atualizado: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo Nome: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = sc.nextInt();

                    produtoController.atualizarProduto(id, novoNome, novaQuantidade);
                }
                case 4 -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Remover Produto:");

                    System.out.print("ID do Produto a ser removido: ");
                    int id = sc.nextInt();

                    produtoController.removerProduto(id);
                }
                case 5 -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Saindo...");
                }

                default -> {
                    System.out.println("-".repeat(20));
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } while (opcao != 5);
        sc.close();
    }
}