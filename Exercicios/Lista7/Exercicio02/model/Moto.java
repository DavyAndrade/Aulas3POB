package Exercicios.Lista7.Exercicio02.model;

public class Moto extends Veiculo {
    private double cilindrada;

    public Moto(String marca, String modelo, int ano, double cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
