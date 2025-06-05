/*
 * Exercício 4: Contagem de Ocorrências de um Número
Descrição:
Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário.
 */

package Exercicios.Lista5.Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContOcorrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número [%d]: ", i + 1);
            numeros.add(sc.nextInt());
        }

        System.out.print("Digite um número para ser buscado: ");
        int numBusca = sc.nextInt();
        int cont = 0;

        for (int num : numeros) {
            if (num == numBusca) {
                cont++;
            }
        }

        System.out.printf("O número %d apareceu %d vez(es) na lista!", numBusca, cont);

        sc.close();
    }
}
