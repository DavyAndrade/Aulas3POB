/*
 * Descrição:
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
utilizando if-else.
Critérios para ser bissexto:
• Deve ser divisível por 4.
• Se for divisível por 100, deve também ser divisível por 400.
 */

package exercicios02.problema4;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um ano: ");
        int ano = sc.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close();
    }
}