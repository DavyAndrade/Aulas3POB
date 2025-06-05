/*
 * Exercício 1: Maior e Menor Valor em um Array
Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.
Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array.
 */

package Exercicios.Lista4.Exercicio01;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        int[] num = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 5 números inteiros: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Número %d: ", i + 1);
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
        sc.close();
    }
}
