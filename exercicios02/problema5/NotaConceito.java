/*
 * Descrição:
Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case.
Tabela de Conceitos:
• 9 a 10 → A
• 7 a 8 → B
• 5 a 6 → C
• 3 a 4 → D
• 0 a 2 → E
Requisitos:
• Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.".
 */

package exercicios02.problema5;

import java.util.Scanner;

public class NotaConceito {

    public static void exibeConceito(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
            return;
        } else if (nota <= 2) {
            System.out.println("Conceito E");
        } else if (nota <= 4) {
            System.out.println("Conceito D");
        } else if (nota <= 6) {
            System.out.println("Conceito C");
        } else if (nota <= 8) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito A");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a nota: ");
        double nota = sc.nextDouble();

        exibeConceito(nota);

        sc.close();
    }
}
