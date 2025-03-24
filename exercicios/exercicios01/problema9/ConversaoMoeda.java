/*
 * 9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).
 */

package exercicios01.problema9;

import java.util.Scanner;

public class ConversaoMoeda {
    public static double convert(double reais, double cotacao) {
        return reais / cotacao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.print("Informe a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        double dolares = convert(reais, cotacao);

        System.out.printf("O valor equivalente em dólares é: %.2f US$", dolares);

        sc.close();
    }
}