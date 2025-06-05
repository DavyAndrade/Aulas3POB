/*
 * Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.
 */

package Exercicios.Lista3.Exercicio02;

import java.util.Scanner;

public class Tabuada {

    public static void exibirTabuada(int numero) {
        int i = 1;

        while (i <= 10) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        exibirTabuada(numero);

        sc.close();
    }
}
