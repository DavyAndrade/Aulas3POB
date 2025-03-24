package exercicios06.problema2.domain;

public class Funcionario {
    private String nome, categoria;
    private double salarioBase;

    public Funcionario(String nome, String categoria, double salarioBase) {
        this.nome = nome;
        this.categoria = categoria;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal(String categoria) {
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
}