package exercicios06.problema2.domain;

public class Funcionario {
    private String nome;
    private String categoria;
    private double salarioBase;

    public Funcionario(String nome, String categoria, double salarioBase) {
        this.nome = nome;
        this.categoria = categoria;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal() {
        switch (categoria) {
            case "A":
                return salarioBase + (salarioBase * 0.2);

            case "B":
                return salarioBase + (salarioBase * 0.1);

            case "C":
                return salarioBase;

            default:
                System.out.println("Categoria Inválida!");
                return 0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}