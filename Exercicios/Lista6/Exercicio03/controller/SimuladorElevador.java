package Exercicios.Lista6.Exercicio03.controller;

import java.util.Scanner;

import Exercicios.Lista6.Exercicio03.domain.Elevador;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Elevador elevador = new Elevador(1, 20);

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - Exibir Andar Atual");
            System.out.println("4 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;

                case 2:
                    elevador.descer();
                    break;

                case 3:
                    elevador.exibirAndar();
                    break;
                case 4:
                    System.out.println("Saindo do elevador...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (true);
    }
}
