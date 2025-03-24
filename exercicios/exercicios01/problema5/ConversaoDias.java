/*
 * 5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias.
 */

package exercicios01.problema5;

import java.util.Scanner;

public class ConversaoDias {

    public static int anosParaDias(int idade) {
        return idade * 365;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma idade: ");
        int idade = sc.nextInt();

        int dias = anosParaDias(idade);

        System.out.printf("Você viveu aproximadamente %d dias", dias);
        
        sc.close();
    }
}
