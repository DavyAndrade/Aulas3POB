package exercicios08.problema2.controller;

import java.util.Scanner;

import exercicios08.problema2.model.Circulo;
import exercicios08.problema2.model.FormaGeometrica;
import exercicios08.problema2.model.Retangulo;

public class FormaGeometricaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(10));

        // Retângulo
        System.out.println("Digite a largura do retângulo:");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();

        FormaGeometrica retangulo = new Retangulo(largura, altura);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        System.out.println("=".repeat(10));

        // Círculo
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        FormaGeometrica circulo = new Circulo(raio);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("=".repeat(10));
        scanner.close();

    }
}
