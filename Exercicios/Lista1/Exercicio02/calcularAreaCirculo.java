/*
2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área.

Fórmula: Área = π * raio²

Considere π = 3.14159.
*/

package Exercicios.Lista1.Exercicio02;

import java.util.Scanner;

public class calcularAreaCirculo {

    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = calcularArea(raio);

        System.out.printf("A área do círculo é %.2f", area);

        sc.close();
    }
}
