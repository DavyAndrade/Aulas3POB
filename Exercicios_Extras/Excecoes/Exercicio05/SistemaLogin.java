package Excecoes.Exercicio05;

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            validarLogin(usuario, senha);

            System.out.println("Login realizado com sucesso!");

        } catch (LoginInvalidoException e) {
            System.out.println("Erro de login: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarLogin(String usuario, String senha) throws LoginInvalidoException {
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new LoginInvalidoException("Nome de usuário não pode estar vazio.");
        }

        if (senha == null || senha.trim().isEmpty()) {
            throw new LoginInvalidoException("Senha não pode estar vazia.");
        }
    }
}