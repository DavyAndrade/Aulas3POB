package Heranca.Exercicio02.model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de portas: " + numeroPortas);
    }
}
