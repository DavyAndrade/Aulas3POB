package alunotxt.view;

import java.util.Scanner;

import alunotxt.controller.AlunoController;

public class AlunoView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoController controller = new AlunoController();
        int opcao;

        do {
            System.out.println("=== Menu de Alunos ===");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Remover Aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Matrícula do Aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    System.out.println("CR do Aluno: ");
                    double cr = scanner.nextDouble();
                    controller.adicionarAluno(matricula, nome, cr);
                    break;

                case 2:
                    controller.listarAlunos();
                    break;

                case 3:
                    System.out.println("Informe a Matrícula do Aluno: ");
                    matricula = scanner.nextInt();
                    controller.atualizarAluno(matricula);
                    break;

                case 4:
                    System.out.println("Informe a Matrícula do Aluno: ");
                    matricula = scanner.nextInt();
                    controller.removerAluno(matricula);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção Inválida! Insira um valor válido.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
