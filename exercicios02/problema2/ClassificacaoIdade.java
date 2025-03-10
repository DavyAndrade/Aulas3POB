/*
 * Descrição:
Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:
• Menor de idade (menos de 18 anos)
• Adulto (entre 18 e 60 anos)
• Idoso (mais de 60 anos)
 */

import java.util.Scanner;
 

public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Menor de Idade");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}