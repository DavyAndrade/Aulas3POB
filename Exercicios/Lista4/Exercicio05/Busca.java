/*
 * Exercício 5: Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.
Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado.".
 */

package Exercicios.Lista4.Exercicio05;

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 10, 100, 1223, 4, 32, 50, 94, 83 };
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Digite um número para buscar: ");
        int numeroBuscado = sc.nextInt();

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.printf("Número %d encontrado na posição %d.%n", numeroBuscado, i + 1);
                break;
            }
        }

        if (i == numeros.length) {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}
