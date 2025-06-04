package excecoes.problema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraNumeros {
    public static void main(String[] args) {
        int number[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {
            try {
                System.out.println("Digite um valor: ");
                int entrada = scanner.nextInt();
                number[i] = entrada;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        } while (i < number.length);

        System.out.println("Números digitados:");
        for (int num : number) {
            System.out.println(num);
        }

        scanner.close();
    }

}
