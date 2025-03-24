/*
 * Exercício 4: Contagem de Números Pares em um Array

Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array.
Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são
pares.
• Exibir a quantidade de números pares encontrados.
 */

package exercicios04.problema4;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int quantidadePares = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.printf("Quantidade de números pares: %d\n", quantidadePares);
        sc.close();
    }
}