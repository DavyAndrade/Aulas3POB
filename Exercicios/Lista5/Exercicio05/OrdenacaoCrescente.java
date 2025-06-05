/*
 * Exercício 5: Ordenação de Lista de Números
Descrição:
Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar Collections.sort() para ordenar os números.
• Exibir a lista ordenada após a ordenação.
 */

package Exercicios.Lista5.Exercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            } else {
                numeros.add(num);
            }
        }

        Collections.sort(numeros);

        System.out.println("Números ordenados crescentemente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
