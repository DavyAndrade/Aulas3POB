package Exercicios.Lista6.Exercicio04.controller;

import java.util.Scanner;

import Exercicios.Lista6.Exercicio04.domain.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota;

        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.print("Informe a sua nota: ");
        nota = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota);

        if (!aluno.validarNota()) {
            while (true) {
                System.out.print("Informe uma nota válida: ");
                nota = sc.nextDouble();
                aluno = new Aluno(nome, nota);

                if (aluno.validarNota()) {
                    break;
                }
            }
            
            aluno.classificarAluno();

            sc.close();
        }
    }
}
