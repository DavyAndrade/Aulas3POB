/*
 * 8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159.
 */

package exercicio01.problema8;

import java.util.Scanner;

public class VolumeEsfera {
    public static double calcularVolumeEsfera(double raio) {
        return (4 / 3) * Math.PI * Math.pow(raio, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = calcularVolumeEsfera(raio);

        System.out.printf("O volume da esfera com raio %.2f é %.2f%n", raio, volume);
        
        sc.close();
    }
}
