package Exercicios.Lista8.Exercicio03.controller;

import java.util.Scanner;

import Exercicios.Lista8.Exercicio03.model.DispositivoEletronico;
import Exercicios.Lista8.Exercicio03.model.Smartphone;
import Exercicios.Lista8.Exercicio03.model.Televisao;

public class DispositivoEletronicoController {
    public static void main(String[] args) {
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        do {
            System.out.println("=".repeat(10));
            System.out.println("Deseja utilizar qual dispositivo?");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisão");
            System.out.println("3. Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();
            System.out.println("=".repeat(10));

            switch (opcao) {
                // Interação com o Smartphone
                case 1:
                    System.out.println("Interagindo com o smartphone...");
                    System.out.println("1. Ligar");
                    System.out.println("2. Desligar");
                    System.out.print("Escolha uma ação: ");
                    int acao = scanner.nextInt();
                    if (acao == 1) {
                        smartphone.ligar();
                    } else if (acao == 2) {
                        smartphone.desligar();
                    } else {
                        System.out.println("Ação inválida.");
                    }
                    break;

                // Interação com a Televisão
                case 2:
                    System.out.println("Interagindo com a televisão...");
                    System.out.println("1. Ligar");
                    System.out.println("2. Desligar");
                    System.out.print("Escolha uma ação: ");
                    int acaoTV = scanner.nextInt();
                    if (acaoTV == 1) {
                        televisao.ligar();
                    } else if (acaoTV == 2) {
                        televisao.desligar();
                    } else {
                        System.out.println("Ação inválida.");
                    }
                    break;

                // Sair do programa
                case 3:
                    System.out.println("Saindo do programa...");
                    running = false;
                    scanner.close();
                    break;

                // Opção inválida
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (running);
    }
}