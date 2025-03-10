/*
 * 4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.
 */

package exercicios01.problema4;

import java.util.Scanner;

public class MediaSimples {

    public static double media(double valores[], int quant) {
        double soma = 0;
        for (int i = 0; i < quant; i++) {
            soma += valores[i];
        }
        return soma / quant;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double media = media(notas, notas.length);
        System.out.printf("A média das notas é: %.2f", media);
        sc.close();
    }
}
