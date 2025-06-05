package Exercicios.Lista6.Exercicio05.controller;

import java.util.Scanner;

import Exercicios.Lista6.Exercicio05.domain.CaixaEletronico;

public class SimuladorCaixa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico(10000);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para saque: ");
                    double valorSaque = sc.nextDouble();

                    if (caixa.sacar(valorSaque)) {
                        caixa.exibirSaldo();
                        break;
                    } else {
                        break;
                    }

                case 2:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
