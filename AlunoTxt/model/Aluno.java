package AlunoTxt.model;

public class Aluno {
    private int matricula;
    private String nome;
    private double cr;

    public Aluno(int matricula, String nome, double cr) {
        this.matricula = matricula;
        this.nome = nome;
        this.cr = cr;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public void mostrarInfo() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CR: " + cr);
    }
}
