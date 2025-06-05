/* 
 * Crie um programa que solicite um número inteiro ao usuário e determine se ele é
par ou ímpar, utilizando a estrutura if-else.
Requisitos:
• O programa deve ler um número inteiro.
• Se o número for divisível por 2, exibir "O número é par."
• Caso contrário, exibir "O número é ímpar.".F
 */

package Exercicios.Lista2.Exercicio01;

import java.util.Scanner;

public class ImparOuPar {
    public static int verificar(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int numero = sc.nextInt();

        if (verificar(numero) == 1) {
            System.out.printf("%d é Par\n", numero);
        } else {
            System.out.printf("%d é Ímpar\n", numero);
        }
        sc.close();

    }
}