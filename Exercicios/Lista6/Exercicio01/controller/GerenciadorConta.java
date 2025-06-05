package Exercicios.Lista6.Exercicio01.controller;

import java.util.Scanner;

import Exercicios.Lista6.Exercicio01.domain.ContaBancaria;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, 0);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("4 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
