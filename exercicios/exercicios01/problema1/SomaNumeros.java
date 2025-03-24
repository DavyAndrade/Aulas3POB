/* 
1. Soma de Dois Números
Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles.
*/

package exercicios01.problema1;

import java.util.Scanner;

public class SomaNumeros {

    public static int sumTwoNumers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int sum = sumTwoNumers(num1, num2);

        System.out.print("A soma dos números é: " + sum);

        sc.close();
    }
}