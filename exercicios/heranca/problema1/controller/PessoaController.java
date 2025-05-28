package heranca.problema1.controller;

import heranca.problema1.model.Professor;
import heranca.problema1.model.Aluno;

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
