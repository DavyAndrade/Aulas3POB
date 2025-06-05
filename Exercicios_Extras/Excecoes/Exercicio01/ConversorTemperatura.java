package Excecoes.Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número válido.");
        }

        scanner.close();
    }
}
