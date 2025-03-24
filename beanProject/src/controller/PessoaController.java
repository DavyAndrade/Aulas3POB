package beanProject.src.controller;

import java.util.Scanner;

import domain.Pessoa;

public class PessoaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o nome: ");
        String nome = sc.nextLine();

        System.out.print("Entre com a idade: ");
        int idade = sc.nextInt();

        System.out.print("Entre com a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Entre com o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Entre com o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso, sexo);

        pessoa.listarPessoa();

        double imc = pessoa.calcularIMC();

        pessoa.calcularIMC();

        System.out.printf("IMC: %.2f", imc);

        sc.close();
    }
}