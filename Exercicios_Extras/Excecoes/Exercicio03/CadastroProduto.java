package Excecoes.Exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco = scanner.nextDouble();

            Produto produto = new Produto(nome, preco);
            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número válido para o preço.");
        } finally {
            scanner.close();
        }
    }
}
