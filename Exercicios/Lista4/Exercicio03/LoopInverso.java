/*
 * Exercício 3: Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.
Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.
 */

package Exercicios.Lista4.Exercicio03;

import java.util.Scanner;

public class LoopInverso {
    public static void main(String[] args) {
        int[] num = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            num[i] = sc.nextInt();
        }

        System.out.println("\nArray inverso:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.printf("%d ", num[i]);
        }
        sc.close();
    }
}