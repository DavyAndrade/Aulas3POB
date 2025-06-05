/*
3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32.

*/

package Exercicios.Lista1.Exercicio03;

public class conversaoTemperatura {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 32.0;
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit", celsius, fahrenheit);
    }
}
