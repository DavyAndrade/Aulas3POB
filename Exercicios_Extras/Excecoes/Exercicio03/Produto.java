package Excecoes.Exercicio03;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("O preço não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
