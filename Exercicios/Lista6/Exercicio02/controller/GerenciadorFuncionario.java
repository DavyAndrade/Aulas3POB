package Exercicios.Lista6.Exercicio02.controller;

import java.util.Scanner;

import Exercicios.Lista6.Exercicio02.domain.Funcionario;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Categoria do Funcionário: ");
        String categoria = sc.nextLine();

        System.out.print("Salário Base: ");
        double salarioBase = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, categoria, salarioBase);

        double salarioFinal = funcionario.calcularSalarioFinal();

        System.out.printf("Salário Final: %.2f", salarioFinal);

        sc.close();
    }
}
