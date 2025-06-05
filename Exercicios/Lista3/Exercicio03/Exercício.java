/*
Exercício 3:
Contagem regressiva usando do-while Descrição:
Crie um
programa que
solicite um
número ao
usuário e
faça uma
contagem regressiva até 0,
utilizando um loop do-while.Requisitos:•
O programa
deve solicitar
um número
inteiro positivo
ao usuário.•
Utilizar um
contador decrescente
para reduzir
o valor até 0.•
Exibir os
números da
contagem regressiva
um por um. */

package Exercicios.Lista3.Exercicio03;

import java.util.Scanner;

public class Exercício {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.print("Informe um número inteiro positivo: ");
        int num = sc.nextInt();

        while (contador <= num) {
            System.out.println(num - contador);
            contador++;
        }

        sc.close();
    }
}
