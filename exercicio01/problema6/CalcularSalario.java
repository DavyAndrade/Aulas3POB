/*
 * 6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.

 */

package exercicio01.problema6;

import java.util.Scanner;

public class CalcularSalario {
    public static double calcularSalarioLiquido(double salarioBruto, double descontoInss) {
        double salarioLiquido = salarioBruto - (descontoInss * salarioBruto / 100);
        return salarioLiquido;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Entre com o desconto do INSS (%): ");
        double descontoInss = sc.nextDouble();

        double salarioLiquido = calcularSalarioLiquido(salarioBruto, descontoInss);

        System.out.printf("O salário líquido é: R$ %.2f", salarioLiquido);

        sc.close();
    }
}
