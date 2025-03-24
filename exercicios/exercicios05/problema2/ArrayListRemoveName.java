/*
 * Exercício 2: Remover um Elemento da Lista
Descrição:
Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
removido da lista. Exiba a lista após a remoção.
Requisitos:
• Criar um ArrayList<String> para armazenar os nomes.
• Utilizar remove() para excluir o nome informado.
• Se o nome não existir na lista, exibir uma mensagem informando.
 */

package exercicios05.problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemoveName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um nome: ");
            nomes.add(sc.nextLine());
        }
        System.out.println("Lista inicial:");
        System.out.println(nomes);

        System.out.print("Informe um nome a ser removido: ");
        String nome = sc.nextLine();

        if (nomes.remove(nome)) {
            System.out.println("Nome removido com sucesso!");
            System.out.println(nomes);
        } else {
            System.out.println("O nome não está presente na lista.");
        }
        sc.close();
    }
}
