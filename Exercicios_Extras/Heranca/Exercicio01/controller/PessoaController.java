package Heranca.Exercicio01.controller;

import Heranca.Exercicio01.model.Aluno;
import Heranca.Exercicio01.model.Professor;

public class PessoaController {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "Engenharia");
        Professor professor = new Professor("Maria", 40, 5000.00);

        System.out.println("Dados do Aluno:");
        aluno.exibirDados();
        
        System.out.println("\nDados do Professor:");
        professor.exibirDados();
    }
}
