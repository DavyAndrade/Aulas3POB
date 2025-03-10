/*
 * 7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura).
 */

package exercicios01.problema7;

import java.util.Scanner;

public class CalculoRetangulo {
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a base do Retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Entre com a altura do Retângulo: ");
        double altura = sc.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.printf("Área = %.2f, Perímetro = %.2f", area, perimetro);

        sc.close();
    }

}
