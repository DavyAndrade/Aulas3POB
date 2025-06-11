package Veiculos.view;

import java.util.ArrayList;
import java.util.Scanner;

import Veiculos.controller.VeiculoController;
import Veiculos.model.Caminhao;
import Veiculos.model.Carro;
import Veiculos.model.Moto;
import Veiculos.model.Veiculo;

public class VeiculoView {
    Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        VeiculoController controller = new VeiculoController();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Veículos!");
        System.out.println("Por favor, escolha uma das opções abaixo:");

        do {
            System.out.println("=== Menu de Veículos ===");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("=== Cadastro de Veículo ===");
                    System.out.println("Tipo de Veículo:");
                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    System.out.println("3. Caminhão");
                    System.out.print("Escolha uma opção: ");
                    int tipoVeiculo = sc.nextInt();

                    sc.nextLine(); // Limpar o buffer do scanner

                    switch (tipoVeiculo) {
                        case 1 -> {
                            System.out.println("=".repeat(10));
                            System.out.println("Cadastro de Carro");
                            System.out.println("Placa: ");
                            String placa = sc.nextLine();
                            System.out.println("Modelo: ");
                            String modelo = sc.nextLine();
                            System.out.println("Ano: ");
                            int ano = sc.nextInt();
                            System.out.println("Quantidade de Portas: ");
                            int qtdPortas = sc.nextInt();

                            Veiculo carro = new Carro(placa, modelo, ano, qtdPortas);
                            controller.cadastrarVeiculo(veiculos, carro);

                            System.out.println("Carro cadastrado com sucesso!");
                            System.out.println("=".repeat(10));
                            break;
                        }
                        case 2 -> {
                            System.out.println("=".repeat(10));
                            System.out.println("Placa: ");
                            String placaMoto = sc.nextLine();
                            System.out.println("Modelo: ");
                            String modeloMoto = sc.nextLine();
                            System.out.println("Ano: ");
                            int anoMoto = sc.nextInt();
                            System.out.println("Cilindrada: ");
                            int cilindrada = sc.nextInt();

                            Veiculo moto = new Moto(placaMoto, modeloMoto, anoMoto, cilindrada);
                            controller.cadastrarVeiculo(veiculos, moto);

                            System.out.println("Moto cadastrada com sucesso!");
                            System.out.println("=".repeat(10));
                            break;
                        }
                        case 3 -> {
                            System.out.println("=".repeat(10));
                            System.out.println("Placa: ");
                            String placaCaminhao = sc.nextLine();
                            System.out.println("Modelo: ");
                            String modeloCaminhao = sc.nextLine();
                            System.out.println("Ano: ");
                            int anoCaminhao = sc.nextInt();
                            System.out.println("Capacidade de Carga (em toneladas): ");
                            int capacidadeCarga = sc.nextInt();

                            Veiculo caminhao = new Caminhao(placaCaminhao, modeloCaminhao, anoCaminhao,
                                    capacidadeCarga);
                            controller.cadastrarVeiculo(veiculos, caminhao);

                            System.out.println("Caminhão cadastrado com sucesso!");
                            System.out.println("=".repeat(10));
                            break;
                        }
                        default -> {
                            System.out.println("Opção inválida! Por favor, escolha um tipo de veículo válido.");
                            System.out.println("=".repeat(10));
                            continue;
                        }
                    }
                    break;
                }

                case 2 -> {
                    System.out.println("=".repeat(10));
                    controller.listarVeiculos(veiculos);
                    System.out.println("=".repeat(10));
                    break;
                }

                case 3 -> {
                    System.out.println("Encerrando o programa...");
                    break;
                }

                default -> {
                    System.out.println("Opção Inválida! Insira um valor válido.");
                    break;
                }
            }
        } while (opcao != 3);
        sc.close();
    }
}
