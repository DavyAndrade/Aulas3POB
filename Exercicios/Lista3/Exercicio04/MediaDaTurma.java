/*
 * Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.
 */

package Exercicios.Lista3.Exercicio04;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        int i;
        double somaNotas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = sc.nextInt();

        for (i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        double mediaTurma = somaNotas / quantidadeAlunos;
        System.out.printf("A média das notas da turma é: %.2f", mediaTurma);
        sc.close();
    }
}
