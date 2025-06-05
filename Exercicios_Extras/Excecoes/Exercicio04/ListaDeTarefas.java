package Excecoes.Exercicio04;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case "2":
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        if (indice < 0 || indice >= tarefas.size()) {
                            System.out.println("Índice fora do intervalo!");
                        } else {
                            String removida = tarefas.remove(indice);
                            System.out.println("Tarefa removida: " + removida);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida! Digite um número inteiro.");
                    }
                    break;

                case "3":
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa na lista.");
                    } else {
                        System.out.println("=== Lista de Tarefas ===");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i));
                        }
                    }
                    break;

                case "0":
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
