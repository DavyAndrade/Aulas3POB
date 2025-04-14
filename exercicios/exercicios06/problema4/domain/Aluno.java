package exercicios06.problema4.domain;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean validarNota() {
        if (nota >= 0 && nota <= 10) {
            return true;
        } else {
            System.out.println("Nota inválida.");
            return false;
        }
    }

    public void classificarAluno() {
        if (nota < 5) {
            System.out.println(nome + " está Reprovado.");
            return;
        } else if (nota < 7) {
            System.out.println(nome + " está em Recuperação.");
        } else {
            System.out.println(nome + " está Aprovado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
