/*
 * Exercício 5: Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados.
 */

package exercicios03.problema5;

import java.util.Scanner;

public class NumerosPrimos {

    public static boolean isPrimo(int num) {
        int i;

        if (num <= 1) {
            return false;
        } else {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o início do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Entre com o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.printf("Números primos no intervalo [%d %d]: ", inicio, fim);
        for (int num = inicio; num <= fim; num++) {
            if (isPrimo(num)) {
                System.out.printf("%d ", num);
            }
        }

        sc.close();
    }
}
