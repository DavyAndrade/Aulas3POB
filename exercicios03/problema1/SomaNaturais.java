/*
 * Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total.
 */

package exercicios03.problema1;

import java.util.Scanner;

public class SomaNaturais {

    public static int calcularSoma(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = calcularSoma(n);

        System.out.printf("A soma dos primeiros %d números naturais é: %d%n", n, soma);

        sc.close();
    }
}
