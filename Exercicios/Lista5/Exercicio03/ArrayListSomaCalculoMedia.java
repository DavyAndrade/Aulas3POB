/*
 * Exercício 3: Soma de Números e Cálculo da Média
Descrição:
Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
números inseridos (excluindo o -1).
Requisitos:
• Criar um ArrayList<Double> para armazenar os números.
• Utilizar um loop while para permitir inserções até o usuário digitar -1.
• Utilizar um loop for para calcular a soma e a média dos números inseridos.
 */

package Exercicios.Lista5.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSomaCalculoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            double numero = sc.nextDouble();

            if (numero == -1) {
                break;
            } else {
                numeros.add(numero);
            }
        }

        double soma = 0;
        int quant = 0;
        for (double num : numeros) {
            soma += num;
            quant++;
        }

        double media = soma / quant;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        sc.close();
    }
}
