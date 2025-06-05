/*
 * Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.
Requisitos:
• O programa deve solicitar dois números e a operação desejada.
• Deve usar switch-case para executar a operação correspondente.
• Caso a operação não seja válida, exibir "Operação inválida.".
• Se a operação for divisão (/), verificar se o segundo número é zero antes de
calcular.
 */

package Exercicios.Lista2.Exercicio03;

import java.util.Scanner;

public class CalculadoraSwitchCase {

    public static double calcular(double num1, double num2, int operacao) {
        switch (operacao) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divisão por zero não é permitida.");
                    return 0;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.println("Operação inválida.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a Operação: \n\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4- Divisão");
        int operacao = sc.nextInt();

        double resultado = calcular(num1, num2, operacao);

        System.out.printf("Resultado: %.2f%n", resultado);

        sc.close();
    }
}
