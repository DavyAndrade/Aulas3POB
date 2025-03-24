/*
 * Exercício 1: Adicionar e Exibir Números
Descrição:
Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList.
 */

package exercicios05.problema1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddNumber {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            } else {
                lista.add(num);
            }
        }

        System.out.println("\nNúmeros digitados:");

        System.out.print(lista);
        sc.close();
    }
}
