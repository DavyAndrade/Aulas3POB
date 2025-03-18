package exercicios06.problema2.controller;

import java.util.Scanner;
import exercicios06.problema2.domain.Funcionario;

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

        double salarioFinal = funcionario.calcularSalarioFinal(categoria);

        System.out.printf("Salário Final: %.2f", salarioFinal);

        sc.close();
    }
}
